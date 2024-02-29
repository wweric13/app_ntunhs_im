package com.example.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.EditText)
        val result_textView=findViewById<TextView>(R.id.result_textView)
        val guess_button =findViewById<Button>(R.id.GUESS)
        val reset_button =findViewById<Button>(R.id.RESET)
        val editText = findViewById<EditText>(R.id.EditText)

        var validate_num:Int
        val secret : Int = Random().nextInt(10)+1
        guess_button.setOnClickListener{
            result_textView.text=editText.text
           //Toast.makeText(this,editText.text,Toast.LENGTH_LONG)
            validate_num =editText.text.toString().toInt()-secret
            var ans_str:String="BINGO"
            if (validate_num>0){
                ans_str="你猜的比較大喔"
            }else if(validate_num<0){
                ans_str="你猜得比較小喔"
            }
            result_textView.text=ans_str
        }
        reset_button.setOnClickListener{
            validate_num = Random().nextInt(10)+1
            result_textView.text= "再猜一次"

        }
    }
}