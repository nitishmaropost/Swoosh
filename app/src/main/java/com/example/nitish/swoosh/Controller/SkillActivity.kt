package com.example.nitish.swoosh.Controller

import android.os.Bundle
import com.example.nitish.swoosh.Utilities.EXTRA_LEAGUE
import com.example.nitish.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
