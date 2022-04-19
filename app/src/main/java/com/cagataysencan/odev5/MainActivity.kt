package com.cagataysencan.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cagataysencan.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var text = tasarim.hesap
        var text2 = ""

        tasarim.button0.setOnClickListener {
            text2 += "0"
            text.setText("${text2}")
        }

        tasarim.button1.setOnClickListener {
            text2 += "1"
            text.setText("${text2}")
        }

        tasarim.button2.setOnClickListener {
            text2 += "2"
            text.setText("${text2}")
        }

        tasarim.button3.setOnClickListener {
            text2 += "3"
            text.setText("${text2}")
        }

        tasarim.button4.setOnClickListener {
            text2 += "4"
            text.setText("${text2}")
        }

        tasarim.button5.setOnClickListener {
            text2 += "5"
            text.setText("${text2}")
        }

        tasarim.button6.setOnClickListener {
            text2 += "6"
            text.setText("${text2}")
        }

        tasarim.button7.setOnClickListener {
            text2 += "7"
            text.setText("${text2}")
        }

        tasarim.button8.setOnClickListener {
            text2 += "8"
            text.setText("${text2}")
        }

        tasarim.button9.setOnClickListener {
            text2 += "9"
            text.setText("${text2}")
        }

        tasarim.buttonVirgul.setOnClickListener {
            text2 += "."
            text.setText("${text2}")
        }

        tasarim.buttonArti.setOnClickListener {
            text2 += "+"
            text.setText("${text2}")
        }

        tasarim.buttonSifirla.setOnClickListener {
            text2 = ""
            text.setText(text2)
        }
        tasarim.buttonEsittir.setOnClickListener {
            val input = text2
            val s = input.split("+")
            var result = 0.0
            for(i in s) {
                result += i.toDouble()
            }
            text2 = result.toString()
            text.setText(text2)

        }

        tasarim.buttonSil.setOnClickListener {
            if(text2.isNotEmpty()) {
                text2 = text2.dropLast(1)
                text.setText(text2)
            }
        }
    }


}