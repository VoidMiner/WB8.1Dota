package com.ands.wb5weekweb.di

import com.ands.wb5weekweb.repository.Repository
import com.ands.wb5weekweb.usecases.CacheDotaHeroesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {


    @Provides
    fun provideCacheHeroesUseCase(repository: Repository): CacheDotaHeroesUseCase {
        return CacheDotaHeroesUseCase(repository = repository)
    }

}