package com.example.duckfragmentappfrozentask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
var bathCounter: Int = 0
class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        val layout = inflater.inflate(R.layout.fragment_third, container, false)
        val imgDuckBath: ImageView = layout.findViewById(R.id.imgDuckBath)
        val messageBath: TextView = layout.findViewById(R.id.lblMessageBath)

        val layout2 = inflater.inflate(R.layout.fragment_duck_stats, container, false)
        val lblDuckBath: TextView = layout2.findViewById(R.id.lblDuckBath)

        imgDuckBath.setOnClickListener {
            messageBath.visibility = View.VISIBLE
            lblDuckBath.text = "Cleanliness: ${bathCounter + 20}%"
        }
        return layout
    }

}