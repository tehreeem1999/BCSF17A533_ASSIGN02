package com.example.bcsf17a533_assign02

data class Question(
    val id:Int,
    val question: String,
    val optionOne: String,
    val optiontwo: String,
    val optionthree: String,
    val optionfour: String,
    val correctoption: Int

)
{
    val correctOption: Any = TODO()
}