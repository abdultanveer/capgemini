package com.spot.capgemini

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil.setContentView
import kotlinx.android.synthetic.main.activity_main.*
import androidx.databinding.DataBindingUtil
import com.spot.capgemini.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
      var name :String?=null
        private val myName: MyName = MyName("Aleks Haecky")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
       // binding.button.text = ""+name!!.length;
        binding.urName = myName
        binding.apply {
            myName?.nickname = editText.text.toString()
            invalidateAll()
        }
    }

    fun clickHandler(view: View) {
        /*val editText = findViewById<EditText>(R.id.editText);
        val textView = findViewById<TextView>(R.id.textView);*/

        textView.text = editText.text
        //textView.text = editText.text
    }
}
