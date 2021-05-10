package app.myoji.nickname.appjam

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number:Int = 0;

        var numberTextView: TextView = findViewById<TextView>(R.id.numberTextView);
        numberTextView.text = "0";

        var plusButton: Button = findViewById<Button>(R.id.plusButton);
        plusButton.setOnClickListener {
            number += 1;
            numberTextView.text = number.toString();
        }
    }

}
