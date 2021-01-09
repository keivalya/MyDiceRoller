// My approach is shown below
// Better approach https://github.com/google-developer-training/android-kotlin-fundamentals-apps/tree/master/DiceRollerFinal-challenge

package com.keivalya.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
// import android.widget.TextView
// import android.widget.Toast
// import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        // lateinit var diceImage : ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the Button view from the layout and assign a click
        // listener to it.
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
            getRandomDiceImage()
        }
        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image1)
/*
        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

 */
    }

    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //     Toast.LENGTH_SHORT).show()
        // val resultText: TextView = findViewById(R.id.result_text)
        // resultText.text = "Dice Rolled!"

        val randomInt = (1..6).random()
        // resultText.text = randomInt.toString()

        // val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
    /*
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        var ch = resultText.text.toString()
        if (ch == "Hello World!"){
            resultText.text = "1"
        }else{
            var resultInt = resultText.text.toString().toInt()

            if (resultInt<6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }
    */
    private fun getRandomDiceImage() {
        val randomInt = (1..6).random()
        // resultText.text = randomInt.toString()

        // val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage1.setImageResource(drawableResource)
    }
}