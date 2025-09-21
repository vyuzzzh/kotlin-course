package com.vyuzzzh.lessons.lesson06.homework

fun determineSeason(monthNumber: Int) {
    if (monthNumber !in 1..12) {
        println("Номер месяца должен быть от 1 до 12")
        return
    }

    val season = when (monthNumber) {
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        in 9..11 -> "Осень"
        else -> "Зима"
    }
    println("$monthNumber месяц это $season")
}

fun calculateDogAge(dogAge: Int) {
    if (dogAge < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    val humanAge = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        21 + (dogAge - 2) * 4
    }
    println("Возраст собаки: $dogAge лет = $humanAge человеческих лет")
}

fun chooseTransport(distance: Double) {
    if (distance < 0) {
        println("Расстояние не может быть отрицательным")
        return
    }

    val transport = when {
        distance <= 1 -> "пешком"
        distance <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
    println("Для маршрута в ${distance}км рекомендуется: $transport")
}

fun calculateBonus(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val bonusPoints = if (purchaseAmount <= 1000) {
        (purchaseAmount / 100 * 2).toInt()
    } else {
        (purchaseAmount / 100 * 3).toInt()
    }
    println("Вы получите $bonusPoints бонусных баллов")
}

fun determineDocumentType(fileExtension: String) {
    val extension = fileExtension.lowercase()

    val documentType = when (extension) {
        "txt", "doc", "docx", "pdf" -> "Текстовый документ"
        "jpg", "jpeg", "png", "gif", "bmp" -> "Изображение"
        "xls", "xlsx", "csv" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println(documentType)
}

fun convertTemperature(value: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            val result = value * 9 / 5 + 32
            print(result)
            print("F")
        }
        'F' -> {
            val result = (value - 32) * 5 / 9
            print(result)
            print("C")
        }
        else -> {
            println("Единица измерения должна быть 'C' или 'F")
        }
    }
}

fun recommendClothing(temperature: Int) {
    val recommendation = when {
        temperature < -30 -> "не выходить из дома! Слишком холодно"
        temperature < 10 -> "куртка и шапка"
        temperature <= 18 -> "ветровка"
        temperature > 35 -> "не выходить из дома! Слишком жарко"
        else -> "футболка и шорты"
    }
    println("Температура ${temperature}°C рекомендуется: $recommendation")
}

fun selectMovieCategory(age: Int) {
    if (age < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    val categories = mutableListOf<String>()

    if (age <= 9) categories.add("детские")
    if (age in 10..18) categories.add("подростковые")
    if (age >= 18) categories.add("18+")

    println("Для возраста $age лет доступны ${categories.joinToString()} категории")
}