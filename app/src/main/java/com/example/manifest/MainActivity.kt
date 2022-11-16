package com.example.manifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    fun Silnia(){
        println("Test")
        val num=6
        val silnia= mnozenieliczb(num)
        findViewById<Button>(R.id.wywolaniesil).setOnClickListener {
            findViewById<TextView>(R.id.test).setText("Silnia $num = $silnia")
        }
        println("Silnia $num = $silnia")
    }
    fun mnozenieliczb(num: Int): Long{
        if(num>=1)
            return num * mnozenieliczb(num-1)
        else
            return 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var numer = 1
        Silnia()

        findViewById<Button>(R.id.last).setOnClickListener {
            if(numer==1) {
                findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image3)
                numer= 3
            }else{
                if(numer==2){
                    findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image1)
                    numer = 1
                }else{
                    if(numer==3){
                        findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image2)
                        numer=2
                    }
                }
            }
        }
        findViewById<Button>(R.id.next).setOnClickListener {
            if(numer==1) {
                findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image2)
                numer = 2
            }else{
                if(numer==2){
                    findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image3)
                    numer = 3
                }else{
                    if(numer==3){
                        findViewById<ImageView>(R.id.obrazki).setImageResource(R.drawable.image1)
                        numer=1
                    }
                }
            }
        }
    }
}