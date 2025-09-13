package com.vyuzzzh.lessons.lesson04.homework

val v1: Int = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// должно быть с маленькой буквы false, если Boolean или в кавычках "false", если String
// val v6 = FALSE

val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// обратные кавычки используются для переменных
//val v20 = `1.414`

val v21: String = "Artificial Intelligence"
val v22: Array<Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"

// должно быть с маленькой буквы false, если Boolean или в кавычках "false", если String
//val v30: Int = FALSE

val v31: Double = 0.007

// не правильные кавычки
//val v32: Int = “🤯”

val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

// не правильные кавычки
//val v34: Int = ‘65535’

val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f

// должно быть с маленькой буквы true, если Boolean или в кавычках "true", если String
//val v44: Int = TRUE

// 1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
val mediumLetter: Char = 'A'

// 2. Хранить количество ложек сахара, которые я кладу в одну чашку чая.
val sugarSpoons: Int = 0

// 3. Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
val deliveryExpenses: List<Double> = listOf(250.0, 180.5, 315.75, 199.0)

// 4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
val queueLength: Double = 123.456789

// 5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
val isBugClosedAsFeature: Boolean = true

// 6. Хранить количество свистков чайника за день.
val whistlesPerDay: Int = 5

// 7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
val catKeyPresses: Long = 123456L

// 8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
val starCountingAttempts: Long = Long.MAX_VALUE

// 9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
val airMassInMattress: Double = 0.000000123

// 10. Хранить словарь «название стартапа → сумму потерь инвесторов».
val startupLosses: Map<String, Double> = mapOf(
    "Startup1" to 2500000.0,
    "Startup2" to 1750000.5,
)

// 11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
val fixedItselfMessage: String = "починилось само"

// 12. Хранить список тем для митингов, которые на самом деле никому не нужны.
val uselessMeetingTopics: List<String> = listOf(
    "Синхронизация чего-либо-нибудь",
    "Оптимизация кросс-функциональных интерфейсов",
    "Ребрендинг забытой страницы"
)