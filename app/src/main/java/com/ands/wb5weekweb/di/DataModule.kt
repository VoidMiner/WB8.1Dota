package com.ands.wb5weekweb.di

import android.content.Context
import com.ands.wb5weekweb.repository.DotaCacheStorage
import com.ands.wb5weekweb.repository.DotaCacheStorageImpl
import com.ands.wb5weekweb.repository.Repository
import com.ands.wb5weekweb.repository.RepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {



    @Provides
    @Singleton
    fun provideDotaCacheStorage(): DotaCacheStorage = DotaCacheStorageImpl()

    @Provides
    @Singleton
    fun provideRepository(
        @ApplicationContext context: Context,

        dotaCacheStorage: DotaCacheStorage
    ): Repository {
        return RepositoryImpl(
            context = context,
            dotaCacheStorage = dotaCacheStorage
        )
    }


}