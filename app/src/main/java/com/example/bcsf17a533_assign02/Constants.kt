package com.example.bcsf17a533_assign02

object Constants {
    fun getQuestions(): ArrayList<Question>
    {
        val questionList= ArrayList<Question>()
        val question1 = Question(
             1,
            "When did PAKISTAN join the UN?",
            "October 30,1947",
            "October 30,1945",
            "September 30,1948",
            "September 30,1945",
            2
        )
        questionList.add(question1)

        val question2 = Question(
            2,
            "Gadder Port is constructed in the province of?",
            "Punjab",
            "Sindhi",
            "Kpk",
            "Baluchistan",
            4
        )
        questionList.add(question2)

        val question3 = Question(
            3,
            "how many stanzas are there in pakistan national anthem?",
            "One",
            "Two",
            "Three",
            "Four",
            3
        )
        questionList.add(question3)

        val question4 = Question(
            4,
            "What was the old name of PIA:?",
            "Independence airways",
            "Orient airways",
            "Kalochi airways",
            "Pakistan airways",
            2
        )
        questionList.add(question4)

        val question5 = Question(
            5,
            "What official name was given to Pakistan in 1956 constitution?",
            "Islamic Pakistan",
            "Islamic Republic of Pakistan",
            "Republic Pakistan",
            "United states of pakistan",
            2
        )
        questionList.add(question5)

        val question6 = Question(
            6,
            "Who was the Prime Minister of Pakistan during enforcement of first constitution?",
            "Khaja Nazam udin",
            "Muhammad ali bogra",
            "Ibrahim Ismaeil chundrigar",
            "Chudary Muhammad Ali",
            4
        )
        questionList.add(question6)

        val question7 = Question(
            7,
            "What is the other name of Mohammad Ali Bogra Formula?",
            "Constitutional formula",
            "New law of pakistan",
            "pakistan report",
            "Third report",
            4
        )
        questionList.add(question7)

        val question8 = Question(
            8,
            "Who was the Muhammad ali bogra?",
            "Law Minister",
            "Foreign Minister",
            "Prime minister",
            "Parliment Minister",
            1
        )
        questionList.add(question8)

        val question9 = Question(
            9,
            "What document was firstly drafted to give pace to constitution making process?",
            "Pakistan Act",
            "Independence Act",
            "Objective resolution",
            "Representative Act",
            3
        )
        questionList.add(question9)

        val question10 = Question(
            10,
            "When the Constituent Assembly passed the Objective Resolution?",
            "9th june 1949",
            "14th Feb 1949",
            "15th August 1949",
            "12th March 1949",
            4
        )
        questionList.add(question10)
        return questionList;
    }
}