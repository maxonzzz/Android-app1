package com.example.newlab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.newlab1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var btn2: Button
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            val rabbt = Rabbit("Flopsy", 1, "Gray", 2.1, true)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", rabbt.name)
            bundle.putInt("field2", rabbt.age)
            bundle.putString("field3", rabbt.color)
            bundle.putDouble("field4", rabbt.weight)
            bundle.putBoolean("field5", rabbt.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }
        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val bear = Bear("Fred", 3, "Brown", 99.3, false)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", bear.name)
            bundle.putInt("field2", bear.age)
            bundle.putString("field3", bear.color)
            bundle.putDouble("field4", bear.weight)
            bundle.putBoolean("field5", bear.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val fox = Fox("Foxy", 3, "Red", 6.1, false)
            val intent = Intent(this, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("field1", fox.name)
            bundle.putInt("field2", fox.age)
            bundle.putString("field3", fox.color)
            bundle.putDouble("field4", fox.weight)
            bundle.putBoolean("field5", fox.isVegetarian)

            intent.putExtras(bundle)
            startActivity(intent)

        }


    }

        }















