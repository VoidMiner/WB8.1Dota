package com.ands.wb5weekweb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ands.wb5weekweb.di.App
import com.ands.wb5weekweb.fragments.MenuFragment
import com.ands.wb5weekweb.fragments.heroes.DotaHeroesFragment
import com.github.terrakok.cicerone.androidx.AppNavigator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, MenuFragment())
            .addToBackStack(null)
            .commit()

    }
}