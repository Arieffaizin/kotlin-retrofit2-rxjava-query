package com.riefzin.android.learnkotlinretrofitquery

object SearchRepositoryProvider {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(GithubApiService.Factory.create())
    }

}