package com.ands.wb5weekweb.repository

import com.ands.wb5weekweb.model.heroes.DotaHeroesResponse


interface DotaCacheStorage {

    fun saveDotaHeroesToFile(list: List<DotaHeroesResponse>)

    fun getDotaHeroesFromFile(): List<DotaHeroesResponse>

}