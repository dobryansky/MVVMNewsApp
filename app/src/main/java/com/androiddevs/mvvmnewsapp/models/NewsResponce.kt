package com.androiddevs.mvvmnewsapp.models

data class NewsResponce(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)