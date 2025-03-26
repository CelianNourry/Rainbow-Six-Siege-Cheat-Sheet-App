package com.example.logicbomb

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class OperatorDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_operators_details, container, false)

        // Récupération des données passées en arguments
        val imageResId = arguments?.getInt("imageResId")
        val name = arguments?.getString("name")
        val description = arguments?.getString("description")

        val realName = arguments?.getString("realName")
        val birthDate = arguments?.getString("birthDate")
        val age = arguments?.getInt("age")
        val height = arguments?.getString("height")
        val weight = arguments?.getString("weight")
        val town = arguments?.getString("town")

        val countryImageResId = arguments?.getInt("countryImageResId")
        val countryName = arguments?.getString("countryName")
        val unityImageResId = arguments?.getInt("unityImageResId")
        val unityName = arguments?.getString("unityName")

        // Remplissage des vues avec les données
        view.findViewById<ImageView>(R.id.operatorImage).setImageResource(imageResId ?: 0)
        view.findViewById<TextView>(R.id.operatorName).text = name
        view.findViewById<TextView>(R.id.operatorDescription).text = description

        // Informations personnelles
        view.findViewById<TextView>(R.id.realName).text = "Nom réel : $realName"
        view.findViewById<TextView>(R.id.birthDate).text = "Date de naissance : $birthDate"
        view.findViewById<TextView>(R.id.age).text = "Âge : $age ans"
        view.findViewById<TextView>(R.id.height).text = "Taille : $height"
        view.findViewById<TextView>(R.id.weight).text = "Poids : $weight"
        view.findViewById<TextView>(R.id.town).text = "Ville : $town"

        // Pays et unité
        view.findViewById<ImageView>(R.id.countryImage).setImageResource(countryImageResId ?: 0)
        view.findViewById<TextView>(R.id.countryName).text = countryName
        view.findViewById<ImageView>(R.id.unityImage).setImageResource(unityImageResId ?: 0)
        view.findViewById<TextView>(R.id.unityName).text = unityName

        return view
    }
}
