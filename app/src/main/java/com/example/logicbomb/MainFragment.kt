package com.example.logicbomb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        val operatorsButton = view.findViewById<Button>(R.id.operatorButton)
        val creditsButton = view.findViewById<Button>(R.id.creditsButton)

        operatorsButton.setOnClickListener {
            // Naviguer vers le fragment opérateur
            Navigation.findNavController(view).navigate(R.id.navigateToOperators)
        }
        creditsButton.setOnClickListener {
            // Naviguer vers le fragment crédits (BUGGER)
            //Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_creditsActivity)
        }
        return view
    }
}