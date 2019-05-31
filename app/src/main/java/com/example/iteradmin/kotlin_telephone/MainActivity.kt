package com.example.iteradmin.kotlin_telephone

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telephony.TelephonyManager
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt=findViewById<TextView>(R.id.text)
        val tpm:TelephonyManager=getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        var s:String=tpm.networkCountryIso.toString()
        txt.setText(s)
        Toast.makeText(applicationContext,s,Toast.LENGTH_LONG).show()
    }
}
