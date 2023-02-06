package com.example.testsafety

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondfragmentViewModel(repository: Repository):ViewModel() {

    private var _mutablePersonLiveData = MutableLiveData<Person>()
    val personLiveData: LiveData<Person>
        get() {
            return _mutablePersonLiveData
        }

    init {
        _mutablePersonLiveData.value = Person("Sasha", 28)
    }
    fun changelivedata(){
        _mutablePersonLiveData.value = Person("Bob", 28)
    }
    }