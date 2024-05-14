package com.example.duckfragmentappfrozentask

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
var hungerCount: Int = 0
class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val layout = inflater.inflate(R.layout.fragment_first, container, false)
        val imgFeedDuck: ImageView = layout.findViewById(R.id.imgDuckFeed)
        val lblMessage: TextView = layout.findViewById(R.id.lblMessageFeed)

        val layout2 = inflater.inflate(R.layout.fragment_duck_stats, container, false)
        val lblDuckHunger: TextView = layout2.findViewById(R.id.lblDuckFeed)

        imgFeedDuck.setOnClickListener{
            lblMessage.visibility = View.VISIBLE
            lblDuckHunger.text = "Hunger: ${hungerCount + 20}%"
        }
        return layout
    }
}