package com.example.geoquiz

import androidx.lifecycle.ViewModel

class QuestionVM:ViewModel() {
    var i = 0
    var qList = TenQuestions.questionList
 fun setCheat(index : Int){
     qList[index].ischeated = true
 }

}