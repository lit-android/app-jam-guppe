package app.myoji.nickname.appjam

import android.graphics.Color.rgb
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    var second: Int = 10;

    var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timerText: TextView = findViewById(R.id.timerText)
        var numberTextView: TextView = findViewById<TextView>(R.id.numberTextView)
        numberTextView.text = "0"

        var startButton: Button = findViewById<Button>(R.id.startButton)

        var bear1: ImageButton = findViewById(R.id.bear1)
        var bear2: ImageButton = findViewById(R.id.bear2)
        var bear3: ImageButton = findViewById(R.id.bear3)
        var bear4: ImageButton = findViewById(R.id.bear4)
        var bear5: ImageButton = findViewById(R.id.bear5)
        var bear6: ImageButton = findViewById(R.id.bear6)
        var bear7: ImageButton = findViewById(R.id.bear7)
        var bear8: ImageButton = findViewById(R.id.bear8)
        var bear9: ImageButton = findViewById(R.id.bear9)
        var bear10: ImageButton = findViewById(R.id.bear10)
        var bear11: ImageButton = findViewById(R.id.bear11)
        var bear12: ImageButton = findViewById(R.id.bear12)
        var bear13: ImageButton = findViewById(R.id.bear13)
        var bear14: ImageButton = findViewById(R.id.bear14)
        var bear15: ImageButton = findViewById(R.id.bear15)

        var bee1: ImageButton = findViewById(R.id.bee1)
        var bee2: ImageButton = findViewById(R.id.bee2)
        var bee3: ImageButton = findViewById(R.id.bee3)
        var bee4: ImageButton = findViewById(R.id.bee4)
        var bee5: ImageButton = findViewById(R.id.bee5)
        var bee6: ImageButton = findViewById(R.id.bee6)
        var bee7: ImageButton = findViewById(R.id.bee7)
        var bee8: ImageButton = findViewById(R.id.bee8)

        var honey1: ImageButton = findViewById(R.id.honey1)
        var honey2: ImageButton = findViewById(R.id.honey2)

        val timer : CountDownTimer = object : CountDownTimer(10000, 1000){
            override fun onFinish() {
                startButton.isVisible = true
                second = 10
            }


            override fun onTick(millisUntilFinished: Long) {
                second -= 1
                timerText.setTextColor(rgb(255,255,255))
                timerText.text = second.toString()
            }
        }

        startButton.setOnClickListener {
            startButton.isVisible = false
            score = 0
            numberTextView.text = score.toString()
            timer.start()
        }

        var bear = listOf(bear1, bear2, bear3, bear4, bear5, bear6, bear7, bear8, bear9, bear10, bear11, bear12, bear13, bear14, bear15)
        for (num in 0..14) {
            bear[num].setOnClickListener {
                if (second < 10) {
                    score += 100
                    numberTextView.text = score.toString()
                }
            }
        }

        var bee = listOf( bee1, bee2, bee3, bee4, bee5, bee6, bee7, bee8)
        for (num in 0..7) {
            bee[num].setOnClickListener {
                if (second < 10) {
                    score -= 300
                    numberTextView.text = score.toString()
                }
            }
        }

        var honey = listOf( honey1, honey2)
        for (num in 0..1) {
            honey[num].setOnClickListener {
                if (second < 10) {
                    score += 500
                    numberTextView.text = score.toString()
                }
            }
        }

    }

}
