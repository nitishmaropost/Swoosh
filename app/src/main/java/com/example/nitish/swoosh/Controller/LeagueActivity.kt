package com.example.nitish.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.nitish.swoosh.Model.Player
import com.example.nitish.swoosh.R
import com.example.nitish.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", skill = "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        leagueNextButton.setOnClickListener {
            if (!player.league.isNullOrEmpty()) {
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_PLAYER, player)
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
                player.league = "Mens"
            }

            womensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
        }

        womensLeagueBtn.setOnClickListener {
            if (mensLeagueBtn.isChecked)
            {
                player.league = "Womens"
            }

            mensLeagueBtn.isChecked = false
            coedLeagueBtn.isChecked = false
        }

        coedLeagueBtn.setOnClickListener {
            if (mensLeagueBtn.isChecked)
            {
                player.league = "Co-ed"
            }

            mensLeagueBtn.isChecked = false
            womensLeagueBtn.isChecked = false
        }
    }
}
