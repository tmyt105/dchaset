package com.tmyt105.dchaset
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)

        val button = findViewById<Button>(R.id.open_settings_button)
        button.setOnClickListener {

            val intent = Intent(Settings.ACTION_SETTINGS)
            startActivity(intent)

        }





        val button3 = findViewById<Button>(R.id.usb_button)
        button3.setOnClickListener {

            Settings.Global.putInt(contentResolver, Settings.Global.ADB_ENABLED, 1)




        }

    }




}