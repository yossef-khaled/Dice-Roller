package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var DiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_button)
        rollbutton.text="Let's Roll"
        rollbutton.setOnClickListener {
            rollDice()
        }
        DiceImage = findViewById(R.id.Dice_Image)
    }

    private fun rollDice() {
        /*val resultText: TextView = findViewById(R.id.Result_text)
        resultText.text = RandomInt.toString()*/

        val RandomInt = Random.nextInt(6) + 1
        val drawableResource = when (RandomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        DiceImage.setImageResource(drawableResource)
    }
}
