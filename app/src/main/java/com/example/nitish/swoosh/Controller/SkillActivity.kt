package com.example.nitish.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.nitish.swoosh.Model.Player
import com.example.nitish.swoosh.R
import com.example.nitish.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

            beginnerToggleBtn.setOnClickListener {
        if (beginnerToggleBtn.isChecked)
        {
            player.skill = "Beginner"
        }

        ballerToggleBtn.isChecked = false
    }

    ballerToggleBtn.setOnClickListener {
        if (ballerToggleBtn.isChecked)
        {
            player.skill = "Baller"
        }

        beginnerToggleBtn.isChecked = false
    }

        finishBtn.setOnClickListener {
            if (!player.skill.isNullOrEmpty()) {
                val finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_PLAYER, player)
                startActivity(finishIntent)
            }
            else
            {
                Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
