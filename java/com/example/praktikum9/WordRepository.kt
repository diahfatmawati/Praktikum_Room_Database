package com.example.praktikum9

import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizeWords()
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}