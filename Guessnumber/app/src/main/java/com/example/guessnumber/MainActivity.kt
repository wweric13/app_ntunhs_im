package com.example.guessnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    val TAG:String = MainActivity::class.java.simpleName
    private lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler(Looper.getMainLooper())

        val textView = findViewById<TextView>(R.id.EditText)
        val result_textView=findViewById<TextView>(R.id.result_textView)
        val guess_button =findViewById<Button>(R.id.GUESS)
        val reset_button =findViewById<Button>(R.id.RESET)
        val editText = findViewById<EditText>(R.id.EditText)

        var validate_num:Int
        val secret : Int = Random().nextInt(10)+1
        guess_button.setOnClickListener{
            result_textView.text=editText.text
            handler.postDelayed({
                Toast.makeText(this,"5秒後操作執行了!",Toast.LENGTH_SHORT).show()
            },5000)

            validate_num =editText.text.toString().toInt()-secret
            var ans_str:String="BINGO"
            if (validate_num>0){
                ans_str="Answer_is_smaller"
            }else if(validate_num<0){
                ans_str="Answer_is_bigger"
            }
            result_textView.text=ans_str
        }
        reset_button.setOnClickListener{
            validate_num=Random().nextInt(10)+1
            result_textView.text= "One_more_time"

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }
}