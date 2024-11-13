package ro.pub.cs.systems.eim.practicaltest01model

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var counter1 = 0
    private var counter2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referințe la TextView și Button
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)

        // Setează valorile inițiale
        textView1.text = counter1.toString()
        textView2.text = counter2.toString()

        // Click listener pentru butonul 1
        button1.setOnClickListener {
            counter1++
            textView1.text = counter1.toString()
        }

        // Click listener pentru butonul 2
        button2.setOnClickListener {
            counter2++
            textView2.text = counter2.toString()
        }
    }
}