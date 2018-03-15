package com.example.nitish.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.nitish.swoosh.R
import com.example.nitish.swoosh.Utilities.EXTRA_LEAGUE
import com.example.nitish.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)

            beginnerToggleBtn.setOnClickListener {
        if (beginnerToggleBtn.isChecked)
        {
            skill = "Beginner"
        }

        ballerToggleBtn.isChecked = false
    }

    ballerToggleBtn.setOnClickListener {
        if (ballerToggleBtn.isChecked)
        {
            skill = "Baller"
        }

        beginnerToggleBtn.isChecked = false
    }

        finishBtn.setOnClickListener {
            if (!skill.isNullOrEmpty()) {
                val finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_SKILL, skill)
                finishIntent.putExtra(EXTRA_LEAGUE, league)
                startActivity(finishIntent)
            }
            else
            {
                Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
