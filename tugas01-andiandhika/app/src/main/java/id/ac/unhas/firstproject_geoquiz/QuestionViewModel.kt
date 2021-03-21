package id.ac.unhas.firstproject_geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel


//commit 3
class QuestionViewModel(private var currentIndex: Int = 0) : ViewModel() {
    init {
        Log.i("QuestionViewModel", "QuestionViewModel created!")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("QuestionViewModel", "QuestionViewModel destroyed!")
    }

    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    val currentQuestionIndex: Int
        get() = currentIndex

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1)
        if (currentIndex > 5) currentIndex = 5
    }

    fun moveToBack() {
        currentIndex = (currentIndex - 1)
        if (currentIndex < 0) currentIndex = 0
    }
}