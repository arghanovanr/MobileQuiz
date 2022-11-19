package shadowspy.developement.mobilequiz

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Belgia",
            1
        )
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "America",
            "Australia",
            "Poland",
            "India",
            2
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "South Korea",
            "Germany",
            "Japan",
            "Belgia",
            2
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Italy",
            "Argentina",
            "Mexico",
            "India",
            4
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Sweden",
            "Finland",
            "Denmark",
            "England",
            3
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        return questionsList
    }

}