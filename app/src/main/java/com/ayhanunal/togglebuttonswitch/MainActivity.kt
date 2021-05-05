package com.ayhanunal.togglebuttonswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            //buttonView = butonu temsil eder.
            //isChecked = acik ise true kapali ise false

            if(isChecked){
                //aciksa
                Log.e("Switch", "ON")
            }else{
                //kapaliysa
                Log.e("Switch", "OFF")
            }
        }

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            //buttonView = butonu temsil eder.
            //isChecked = acik ise true kapali ise false

            if(isChecked){
                //aciksa
                Log.e("Toggle Button", "ON")
            }else{
                //kapaliysa
                Log.e("Toggle Button", "OFF")
            }
        }

        button.setOnClickListener {
            val switchDurum = switch1.isChecked
            val toggleDurum = toggleButton.isChecked

            Log.e("Button Switch Durum", switchDurum.toString())
            Log.e("Button Toggle Durum", toggleDurum.toString())
        }


    }
}