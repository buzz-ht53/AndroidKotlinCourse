package com.buzz_ht.androidkotlincourse

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.button)
        val diceImage : ImageView= findViewById(R.id.imageView)

        //Starting roll to make app interesting
        rollDice()

        rollButton.setOnClickListener {
            rollDice()
        }
    }

    fun showToastLong(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    fun rollDice(){

        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice.roll()
        val diceImage : ImageView= findViewById(R.id.imageView)
        val diceImage2 : ImageView= findViewById(R.id.imageView2)

        when (diceRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> {
                showToastLong(this,"Congratulations" )
                diceImage.setImageResource(R.drawable.dice_3)
            }
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription= diceRoll.toString()

        when (diceRoll2){
            1 -> diceImage2.setImageResource(R.drawable.dice_1)
            2 -> diceImage2.setImageResource(R.drawable.dice_2)
            3 -> {
                showToastLong(this,"Congratulations" )
                diceImage2.setImageResource(R.drawable.dice_3)
            }
            4 -> diceImage2.setImageResource(R.drawable.dice_4)
            5 -> diceImage2.setImageResource(R.drawable.dice_5)
            6 -> diceImage2.setImageResource(R.drawable.dice_6)
        }

        diceImage2.contentDescription= diceRoll2.toString()

    }
}

/**
 * This class is for Dice only
 * This is a test comment section
 * */
class Dice(private val numSides: Int) {

    fun roll(): Int {

        val luckyNumber = 3;
        return (1..numSides).random()

    }

}


