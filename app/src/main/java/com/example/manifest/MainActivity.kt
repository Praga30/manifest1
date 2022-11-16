package com.example.manifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    fun Silnia(){
        
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var numer = 1

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