package com.example.hw05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
//import kotlin.random.Random
import java.util.*
private lateinit var imageView:ImageView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val txtResult = findViewById<TextView>(R.id.txtResult)
        val imbtnScissors = findViewById<ImageButton>(R.id.imbtnScissors)
        val imbtnRock = findViewById<ImageButton>(R.id.imbtnRock)
        val imbtnPaper = findViewById<ImageButton>(R.id.imbtnPaper)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imbtnRock.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.win))
                }
                2->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.draw))
                }
                3->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.lose))
                }
            }
        }
        imbtnScissors.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.draw))
                }
                2->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.lose))
                }
                3->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.win))
                }
            }

        }
        imbtnPaper.setOnClickListener{
            val iComPlay = Random().nextInt(3)+1
            when(iComPlay){
                1->{
                    imageView.setImageResource(R.drawable.scissor)
                    txtResult.setText(getString(R.string.lose))
                }
                2->{
                    imageView.setImageResource(R.drawable.rock)
                    txtResult.setText(getString(R.string.win))
                }
                3->{
                    imageView.setImageResource(R.drawable.paper)
                    txtResult.setText(getString(R.string.draw))
                }
            }

        }
    }
}