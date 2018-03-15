package com.example.nitish.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nitish.swoosh.Model.Player
import com.example.nitish.swoosh.R
import com.example.nitish.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} near you..."
    }
}
