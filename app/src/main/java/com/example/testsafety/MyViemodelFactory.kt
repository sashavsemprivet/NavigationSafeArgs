package com.example.testsafety

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MyViemodelFactory(var repository: Repository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        return SecondfragmentViewModel(repository) as T
    }
}