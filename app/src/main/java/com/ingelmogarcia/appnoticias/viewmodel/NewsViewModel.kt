package com.ingelmogarcia.appnoticias.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ingelmogarcia.appnoticias.model.NewsModel
import com.ingelmogarcia.appnoticias.model.NewsProvider

class NewsViewModel : ViewModel(){
    val newsModel = MutableLiveData<NewsModel>()

    fun randomNews(){
        val currentNews = NewsProvider.random()
        newsModel.postValue(currentNews)
    }
}