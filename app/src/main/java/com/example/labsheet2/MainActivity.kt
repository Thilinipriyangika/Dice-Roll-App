package com.example.labsheet2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RollText: TextView = findViewById(R.id.Rolltext);
        val RollButton: Button = findViewById(R.id.Rollbutton);

        RollButton.setOnClickListener(){
            Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT);
            diceRoll();
        }
    }
    private fun diceRoll(){
        val RollText: TextView = findViewById(R.id.Rolltext);
        val random = (1..6).random();
        RollText.text=random.toString();


        val diceImage:ImageView=findViewById(R.id.dice_Image)
        val drawImage=when(random){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }
        diceImage.setImageResource(drawImage)
    }
}