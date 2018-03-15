package com.example.nitish.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leagueNextButton.setOnClickListener {
            if (!selectedLeague.isNullOrEmpty()) {
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
                startActivity(skillIntent)
            }
            else
            {
                Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
            }
        }

        mensLeagueBtn.setOnClickListener {
            if (mensLeagueBtn.isChecked)
            {
                selectedLeague = "Mens"
            }

            womensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
        }

        womensLeagueBtn.setOnClickListener {
            if (mensLeagueBtn.isChecked)
            {
                selectedLeague = "Womens"
            }

            mensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
        }

        coedLeagueBtn.setOnClickListener {
            if (mensLeagueBtn.isChecked)
            {
                selectedLeague = "Co-ed"
            }

            mensLeagueBtn.isChecked = false
            womensLeagueBtn.isChecked = false
        }
    }
}
