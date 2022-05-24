package com.gomez.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class BlankFragment1 : Fragment() {
    lateinit var BtnBoton1: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista1=inflater.inflate(R.layout.fragment_blank1, container, false)
        BtnBoton1 = vista1.findViewById(R.id.button1)
        BtnBoton1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment13_to_blankFragment1)

        }
        return  vista1
    }

}