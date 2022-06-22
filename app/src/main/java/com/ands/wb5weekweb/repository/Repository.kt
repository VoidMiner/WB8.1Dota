package com.ands.wb5weekweb.repository

import com.ands.wb5weekweb.model.heroes.DotaHeroesResponse


interface Repository { //функции получения и хранения данных, базы данных



    fun cacheDotaHeroes(list: List<DotaHeroesResponse>)

    fun getCacheDotaHeroes(): List<DotaHeroesResponse>

}