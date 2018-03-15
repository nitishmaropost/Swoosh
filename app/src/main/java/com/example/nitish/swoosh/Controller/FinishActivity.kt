package com.example.nitish.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nitish.swoosh.R
import com.example.nitish.swoosh.Utilities.EXTRA_LEAGUE
import com.example.nitish.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var selectedSkill = ""
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        selectedSkill = intent.getStringExtra(EXTRA_SKILL)
        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
        searchLeaguesText.text = "Looking for $selectedLeague $selectedSkill near you..."
    }
}
