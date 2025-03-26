package com.example.logicbomb

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class WeaponDetailsFragment : Fragment() {
    override fun onCreateView(
        inflater: android.view.LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_weapon_details, container, false)

        val imageResId = arguments?.getInt("imageResId")
        val name = arguments?.getString("name")
        val damage = arguments?.getInt("damage")
        val magSize = arguments?.getInt("magSize")
        val capacityAmmo = arguments?.getInt("capacityAmmo")
        val rateOfFire = arguments?.getInt("rateOfFire")

        // Afficher les données dans l'interface
        view.findViewById<ImageView>(R.id.weaponImage).setImageResource(imageResId ?: 0)
        view.findViewById<TextView>(R.id.weaponName).text = name
        view.findViewById<TextView>(R.id.weaponDamage).text = "Dégâts : $damage"
        view.findViewById<TextView>(R.id.weaponMagSize).text = "Chargeur : $magSize"
        view.findViewById<TextView>(R.id.weaponCapacityAmmo).text = "Munitions totales : $capacityAmmo"
        view.findViewById<TextView>(R.id.weaponRateOfFire).text = "Cadence de tir : $rateOfFire"

        return view
    }
}
