package com.example.logicbomb

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicService : Service() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate() {
        super.onCreate()
        // Initialiser le MediaPlayer et charger la musique
        mediaPlayer = MediaPlayer.create(this, R.raw.clubhouse_theme)
        mediaPlayer.isLooping = true  // Pour que la musique se répète
        mediaPlayer.start()  // Démarrer la musique
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    // Libération de la musique
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}