package com.example.firstapp.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

class WordRepository(private val wordDao: WordDao) {


    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()


    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
