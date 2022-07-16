package com.buzz_ht.androidkotlincourse

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.button)

        /* rollButton.setOnClickListener {
                 Toast.makeText(this, "HEllo", Toast.LENGTH_LONG).show()
         }
 */
        rollButton.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this, "Dice Rolled", Toast.LENGTH_LONG).show()
            val dice = Dice(6)
            val returned = dice.roll()
            val textView = findViewById<TextView>(R.id.textView)
            textView.setText(returned.toString())
        })
    }
}

/**
 * This class is for Dice only
 * This is a test comment section
 * */
class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }

}


