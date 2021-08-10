package com.ebookfrenzy.wordgame.ui.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    private val _streak = MutableLiveData(0)
    val score: LiveData<Int>
        get() = _streak

    private val _lives = MutableLiveData(5)
    val lives: LiveData<Int>
        get() = _lives


    // List of words used in the game
    private var wordsList: MutableList<String> = mutableListOf()
    private lateinit var currentWord: String

    private val _totalWordLetters = MutableLiveData(0)

    val totalWordLetters: LiveData<Int>
        get() = _totalWordLetters

    init {
//        getNextWord()
    }

    // TODO: create getNextWord()
}