package com.example.geoquiz

class Question(question:String, answer:Boolean, cheat:Boolean) {}

object tenQuestions{
    var q1 =Question("Beijing is the capital of China",true,false,)
    var q2 =Question("Oslo is the capital of Brazil",false , false)
    var q3 =Question("Norway is on the American continent",false , false)
    var q4 =Question("Djibouti is on the African continent",true,false,)
    var q5 =Question("Stockholm is the capital of Sweden",true,false,)
    var q6 =Question("The Americas are larger than Asia" ,false,false)
    var q7 =Question("Africa is the second largest continent in the world",true,false,)
    var q8 =Question("The smallest country in the world is the Vatican",true,false,)
    var q9 =Question("Antarctica is the largest country in the world" , false, false)
    var q10 =Question("Russia is the third largest country in the world",false,false)
    var questionList = arrayListOf<Question>(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10)
}