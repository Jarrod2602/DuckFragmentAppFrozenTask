package com.example.duckfragmentappfrozentask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
var attentionCount: Int = 0
class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val layout = inflater.inflate(R.layout.fragment_second, container, false)
        val imgDuckPlay: ImageView = layout.findViewById(R.id.imgDuckPlay)
        val messagePlay: TextView = layout.findViewById(R.id.lblMessagePlay)

        val layout2 = inflater.inflate(R.layout.fragment_duck_stats, container, false)
        val lblDuckPlay: TextView = layout2.findViewById(R.id.lblDuckPlay)

        imgDuckPlay.setOnClickListener {
            messagePlay.visibility = View.VISIBLE
            lblDuckPlay.text = "Attention: ${attentionCount + 20}%"
        }
        return layout
    }

}