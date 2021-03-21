package id.ac.unhas.firstproject_geoquiz

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class QuestionViewModelFactory(private val questionIndex: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuestionViewModel::class.java)){
            return QuestionViewModel(questionIndex) as T
        }
        throw IllegalArgumentException("Unkown ViewModel Class")
    }
}