package com.ands.wb5weekweb.repository

import android.content.Context
import com.ands.wb5weekweb.model.heroes.DotaHeroesResponse


class RepositoryImpl(
    context: Context,

    private val dotaCacheStorage: DotaCacheStorage
) : Repository {

    override fun cacheDotaHeroes(list: List<DotaHeroesResponse>) {
        dotaCacheStorage.saveDotaHeroesToFile(list = list)
    }

    override fun getCacheDotaHeroes(): List<DotaHeroesResponse> {
        return dotaCacheStorage.getDotaHeroesFromFile()
    }

    //private val preferencesListener = SharedPreferences.OnSharedPreferenceChangeListener{_, key-> }




    companion object {

        private const val PREF_SUPERHEROES_VALUE = "PREF_SUPERHEROES_VALUE"
        private const val FILE_PATH = "/data/data/com.ands.wb5weekweb/shared_prefs/${PREF_SUPERHEROES_VALUE}.xml"
    }
}
