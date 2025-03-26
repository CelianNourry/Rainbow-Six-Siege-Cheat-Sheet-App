package com.example.logicbomb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Démarrer le service de musique
        val musicServiceIntent = Intent(this, MusicService::class.java)
        startService(musicServiceIntent)
        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        // Arrêter le service lorsque l'activité est détruite
        val musicServiceIntent = Intent(this, MusicService::class.java)
        stopService(musicServiceIntent)
    }
}