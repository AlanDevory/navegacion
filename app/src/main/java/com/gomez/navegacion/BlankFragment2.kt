package com.gomez.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class BlankFragment2 : Fragment() {
    lateinit var BtnBoton2:Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val vista2=inflater.inflate(R.layout.fragment_blank2, container, false)
        BtnBoton2 = vista2.findViewById(R.id.button2)
        BtnBoton2.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment22_to_blankFragment2)

        }
        return vista2
    }


}