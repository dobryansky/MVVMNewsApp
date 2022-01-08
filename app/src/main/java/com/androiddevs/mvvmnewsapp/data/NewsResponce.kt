package com.androiddevs.mvvmnewsapp.data

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)