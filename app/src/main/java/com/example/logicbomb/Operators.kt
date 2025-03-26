package com.example.logicbomb

import OperatorsIconAdapter
import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButtonToggleGroup

private const val MAX_POINT = 3

class Operators : Fragment() {
    // Composants de la vue
    private lateinit var operatorNameTextView: TextView
    private lateinit var biographyView: LinearLayout
    private lateinit var operatorHealthView: LinearLayout
    private lateinit var operatorSpeedView: LinearLayout
    private lateinit var primaryWeaponLayout: LinearLayout
    private lateinit var secondaryWeaponLayout: LinearLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var toggleGroup: MaterialButtonToggleGroup
    private lateinit var adapter: OperatorsIconAdapter
    private lateinit var mediaPlayer: MediaPlayer

    private var currentOperatorList: List<OperatorData> = listOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_operators, container, false)
        // Initialisation des vues
        operatorNameTextView = view.findViewById(R.id.operatorName)
        biographyView = view.findViewById(R.id.biographyView)
        operatorHealthView = view.findViewById(R.id.operatorHealthLayout)
        operatorSpeedView = view.findViewById(R.id.operatorSpeedLayout)
        primaryWeaponLayout = view.findViewById(R.id.primaryWeaponLayout)
        secondaryWeaponLayout = view.findViewById(R.id.secondaryWeaponLayout)

        recyclerView = view.findViewById(R.id.recyclerView)
        toggleGroup = view.findViewById(R.id.toggleGroup)

        // Configuration du RecyclerView avec 5 icones par lignes
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 5)

        // Par défaut, affiche la liste des attaquants
        updateOperatorList(attackersList)
        toggleGroup.check(R.id.btnAttackers)

        // Gestion du switch pour switch entre attaquants et defenseurs
        val toggleGroup = view.findViewById<MaterialButtonToggleGroup>(R.id.toggleGroup)

        toggleGroup.addOnButtonCheckedListener { _, checkedId, isChecked ->
            if (isChecked) {
                val newList = if (checkedId == R.id.btnAttackers) attackersList else defendersList
                updateOperatorList(newList)
            }
        }

        return view
    }

    // Mise à jour des informations affichées
    private fun updateOperatorInfo(operator: OperatorData) {
        // Met à jour le texte et l'image
        operatorNameTextView.text = operator.name

        // Nettoie les items précédents
        biographyView.removeAllViews()
        operatorHealthView.removeAllViews()
        operatorSpeedView.removeAllViews()
        primaryWeaponLayout.removeAllViews()
        secondaryWeaponLayout.removeAllViews()

        val btnViewBiography = Button(context).apply {
            text = "Voir Biographie"
            textSize = 16f
            setPadding(16, 16, 16, 16)

            setOnClickListener {
                // Création d'un Bundle avec les informations de l'opérateur
                val bundle = Bundle().apply {
                    putInt("imageResId", operator.imageResId)
                    putString("name", operator.name)
                    putString("description", operator.description)
                    putString("realName", operator.personalInfo.realName)
                    putString("birthDate", operator.personalInfo.birthDate)
                    putInt("age", operator.personalInfo.age)
                    putString("height", operator.personalInfo.height)
                    putString("weight", operator.personalInfo.weight)
                    putString("town", operator.personalInfo.town)
                    putInt("countryImageResId", operator.personalInfo.country.imageResId)
                    putString("countryName", operator.personalInfo.country.name)
                    putInt("unityImageResId", operator.personalInfo.unity.imageResId)
                    putString("unityName", operator.personalInfo.unity.name)
                }

                // Navigation vers le fragment des détails
                view?.findNavController()
                    ?.navigate(R.id.action_operators_to_operatorDetailsFragment, bundle)
            }
        }

        // Ajout du bouton au layout dédié
        biographyView.addView(btnViewBiography)

        for (i in 0 until MAX_POINT) {
            val heartView = ImageView(context)
            if (i < operator.health) heartView.setImageResource(R.drawable.heart)

            val layoutParams = LinearLayout.LayoutParams(96, 96)
            layoutParams.marginEnd = 8 // Marge entre les images
            heartView.layoutParams = layoutParams

            operatorHealthView.addView(heartView)
        }
        for (i in 0 until MAX_POINT) {
            val speedView = ImageView(context)
            if (i < operator.speed) speedView.setImageResource(R.drawable.speed)

            val layoutParams = LinearLayout.LayoutParams(96, 96)
            layoutParams.marginEnd = 8 // Marge entre les images
            speedView.layoutParams = layoutParams

            operatorSpeedView.addView(speedView)
        }

        // Affiche les armes principales
        for (weapon in operator.primaryWeapon) {
            // Créer un layout vertical pour chaque arme
            val weaponItemLayout = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
            }

            // Créer le bouton pour l'image de l'arme
            val button = ImageButton(context).apply {
                setImageResource(weapon.imageResId)
                scaleType = ImageView.ScaleType.FIT_CENTER // Ajuste l'image sans distorsion
                layoutParams = LinearLayout.LayoutParams(300, 300).apply {
                    marginEnd = 16
                }
                setBackgroundColor(Color.TRANSPARENT)
                setOnClickListener {
                    // Créer un Bundle pour passer les informations de l'arme dans le fragment WeaponDetailsFragment
                    val bundle = Bundle().apply {
                        putInt("imageResId", weapon.imageResId)
                        putString("name", weapon.name)
                        putInt("damage", weapon.damage)
                        putInt("magSize", weapon.magSize)
                        putInt("capacityAmmo", weapon.capacityAmmo)
                        putInt("rateOfFire", weapon.rateOfFire)
                    }

                    view?.findNavController()
                        ?.navigate(R.id.action_operators_to_weaponDetailsFragment, bundle)
                }
            }

            // Créer le TextView pour afficher le nom de l'arme
            val weaponNameTextView = TextView(context).apply {
                text = weapon.name
                gravity = Gravity.CENTER
                setTextColor(Color.WHITE)
                textSize = 16f
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    topMargin = 8 // Marge entre l'image et le nom de l'arme
                }
            }

            // Ajoute le bouton et le nom de l'arme dans le layout
            weaponItemLayout.addView(button)
            weaponItemLayout.addView(weaponNameTextView)

            // Ajoute le layout dans le parent layout
            primaryWeaponLayout.addView(weaponItemLayout)
        }

        // Affiche les armes secondaires
        for (weapon in operator.secondaryWeapon) {
            val weaponItemLayout = LinearLayout(context).apply {
                orientation = LinearLayout.VERTICAL
                gravity = Gravity.CENTER
            }

            val button = ImageButton(context).apply {
                setImageResource(weapon.imageResId)
                scaleType = ImageView.ScaleType.FIT_CENTER
                layoutParams = LinearLayout.LayoutParams(200, 200).apply {
                    marginEnd = 16
                }
                setBackgroundColor(Color.TRANSPARENT)
                setOnClickListener {
                    val bundle = Bundle().apply {
                        putInt("imageResId", weapon.imageResId)
                        putString("name", weapon.name)
                        putInt("damage", weapon.damage)
                        putInt("magSize", weapon.magSize)
                        putInt("capacityAmmo", weapon.capacityAmmo)
                        putInt("rateOfFire", weapon.rateOfFire)
                    }

                    view?.findNavController()
                        ?.navigate(R.id.action_operators_to_weaponDetailsFragment, bundle)
                }
            }

            val weaponNameTextView = TextView(context).apply {
                text = weapon.name
                gravity = Gravity.CENTER
                setTextColor(Color.WHITE)
                textSize = 12f
                layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                ).apply {
                    topMargin = 8
                }
            }

            weaponItemLayout.addView(button)
            weaponItemLayout.addView(weaponNameTextView)

            secondaryWeaponLayout.addView(weaponItemLayout)
        }
    }

    // Mise à jour de la liste d'opérateurs affichée
    private fun updateOperatorList(newList: List<OperatorData>) {
        currentOperatorList = newList
        adapter = OperatorsIconAdapter(currentOperatorList) { position ->
            val selectedOperator = currentOperatorList[position]
            updateOperatorInfo(selectedOperator)
        }
        recyclerView.adapter = adapter

        // Afficher le premier opérateur de la liste par défaut
        updateOperatorInfo(currentOperatorList[0])
    }
}