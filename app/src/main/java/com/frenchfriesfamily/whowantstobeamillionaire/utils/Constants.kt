package com.frenchfriesfamily.whowantstobeamillionaire.utils

import com.frenchfriesfamily.whowantstobeamillionaire.view.game.enums.TimeDuration

object Constants {

    const val BASE_URL = "https://opentdb.com/"

    const val LAST_LEVEL = 15

    object Game {
        val ANSWER_OPTIONS = listOf("A", "B", "C", "D")
        val DIFFICULTY = listOf("easy", "medium", "hard")
        const val AMOUNT_OF_QUESTION = 6
        const val QUESTION_TYPE = "multiple"
    }

    object TimeDurations {
        val THIRD_DURATION = TimeDuration.THIRD_DURATION.duration
        val SECOND_DURATION = TimeDuration.SECOND_DURATION.duration
        val FIRST_DURATION = TimeDuration.FIRST_DURATION.duration
        const val ZERO = 0
    }

}