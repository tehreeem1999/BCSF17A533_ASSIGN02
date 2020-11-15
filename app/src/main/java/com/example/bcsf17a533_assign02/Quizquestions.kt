package com.example.bcsf17a533_assign02

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quizquestions.*

class Quizquestions: AppCompatActivity() {
    private var mCurrentPosition :Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectionOptionPosition: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestions)
        mQuestionList = Constants.getQuestions()
        setQuestion()
        option_one.setOnClickListener(View.OnClickListener { setQuestion() })
        option_two.setOnClickListener(View.OnClickListener { setQuestion() })
        option_three.setOnClickListener(View.OnClickListener { setQuestion() })
        option_four.setOnClickListener(View.OnClickListener { setQuestion() })
        btn_submit.setOnClickListener(View.OnClickListener { setQuestion() })
    }
    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        val question= mQuestionList !! .get(mCurrentPosition-1)
        defaulOptionView();
        if(mCurrentPosition==mQuestionList!!.size)
        {
            btn_submit.text="Finish"
        }
        else
        {
            btn_submit.text="Submit"
        }
        progressBar.progress=mCurrentPosition
        progress.text="$mCurrentPosition"+"/"+ progressBar.max
        questions.text=question.question
        option_one.text=question.optionOne
        option_two.text=question.optiontwo
        option_three.text=question.optionthree
        option_four.text=question.optionfour
    }

    @Override
    fun onClick(v: View?)
    {
        if (v != null) {
            when(v.id)
            {
                R.id.option_one ->{
                    selectedOptionView(option_one,1)
                }
                R.id.option_two ->{
                    selectedOptionView(option_two,2)
                }
                R.id.option_three ->{
                    selectedOptionView(option_three,3)
                }
                R.id.option_four ->{
                    selectedOptionView(option_four,4)
                }
                R.id.btn_submit ->
                {
                    if(mSelectionOptionPosition==0) {
                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestion()
                            }

                            else -> {
                                Toast.makeText(
                                    this,
                                    "You have Successfully completed the quiz",
                                    Toast.LENGTH_SHORT
                                ).show()
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                            }


                        }
                    } else {
                        val question= mQuestionList?.get(mCurrentPosition -1)
                        val mSelectedOptionPosition = null
                        if(question!!.correctOption != mSelectedOptionPosition) {
                            answerView(mSelectionOptionPosition,R.drawable.wrong_option_border_bg)
                        }
                        answerView(question.correctoption,R.drawable.correct_option_border_bg)
                        if(mCurrentPosition==mQuestionList!!.size) {
                            btn_submit.text ="Finish"
                        } else {
                            btn_submit.text ="Next Question"
                        }
                        mSelectionOptionPosition=0






                    }





                }





            }
        }

    }

    private fun defaulOptionView()
    {
        val options=ArrayList<TextView>()
        options.add(0,option_one)
        options.add(0,option_two)
        options.add(0,option_three)
        options.add(0,option_four)
        for(option in options)
        {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv:TextView,selectedOptionNum : Int)
    {
        defaulOptionView()
        mSelectionOptionPosition =selectedOptionNum
        tv.setTextColor(Color.parseColor("#343A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)
    }

    private fun answerView(answer:Int,drawableView:Int)
    {
        when(answer)
        {
            1 ->{
                option_one.background=ContextCompat.getDrawable(this,drawableView)
            }
            2 ->{
                option_two.background=ContextCompat.getDrawable(this,drawableView)
            }
            3 ->{
                option_three.background=ContextCompat.getDrawable(this,drawableView)
            }
            4 ->{
                option_four.background=ContextCompat.getDrawable(this,drawableView)
            }
        }
    }


}


