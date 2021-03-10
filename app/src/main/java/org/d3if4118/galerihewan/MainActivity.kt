package org.d3if4118.galerihewan

import Hewan
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Button
import android.widget.ImageView
import org.d3if4118.galerihewan.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    private val hewan = listOf("Ayam", "Bebek", "Domba", "Kambing", "Sapi")
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("MainActivity", "Jumlah data: " + getData().size)

//        val nextButton: Button = findViewById(R.id.nextButton)
//        nextButton.setOnClickListener { showNext() }
//
//        val backButton: Button = findViewById(R.id.backButton)
//        backButton.setOnClickListener { showBack() }

    }

//    private fun showNext() {
//        index = if (index == hewan.size-1) 0 else index + 1
//
//        val imageView: ImageView = findViewById(R.id.imageView)
//        val resourceId = when(index) {
//            1 -> R.drawable.bebek
//            2 -> R.drawable.domba
//            3 -> R.drawable.kambing
//            4 -> R.drawable.sapi
//            else -> R.drawable.ayam
//        }
//        imageView.setImageResource(resourceId)
//        val textView: TextView = findViewById(R.id.nameTextView)
//        textView.text = hewan[index]
//
//    }

//    private fun showBack() {
//        index = if (index ==0) hewan.size-1 else index - 1
//
//        val imageView: ImageView = findViewById(R.id.imageView)
//        val resourceId = when(index) {
//            1 -> R.drawable.bebek
//            2 -> R.drawable.domba
//            3 -> R.drawable.kambing
//            4 -> R.drawable.sapi
//            else -> R.drawable.ayam
//        }
//        imageView.setImageResource(resourceId)
//        val textView: TextView = findViewById(R.id.nameTextView)
//        textView.text = hewan[index]
//
//    }

    private fun getData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor"),
            Hewan("Ayam", "Gallus gallus"),
            Hewan("Bebek", "Cairina moschata"),
            Hewan("Domba", "Ovis ammon"),
            Hewan("Kalkun", "Meleagris gallopavo"),
            Hewan("Kambing", "Capricornis sumatrensis"),
            Hewan("Kelinci", "Oryctolagus cuniculus"),
            Hewan("Kerbau", "Bubalus bubalis"),
            Hewan("Kuda", "Equus caballus"),
            Hewan("Sapi", "Bos taurus"),
        )
    }
}