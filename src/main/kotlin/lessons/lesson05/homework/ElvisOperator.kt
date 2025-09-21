package com.vyuzzzh.lessons.lesson05.homework

fun main() {

    // Задача 1
    val initialIntensity: Double = 100.0
    val attenuationCoefficient1: Double? = 0.7

    val resultIntensity = initialIntensity * (attenuationCoefficient1 ?: 0.5)

    // Задача 2
    val cost: Double? = 200.0
    val defaultCost: Double = 50.0
    val deliveryCost: Double = 100.0
    val coefficient = 0.005

    // Страховка = 0.5% от стоимости груза. Если стоимость null, используем 50.
    val insuranceCost = (cost ?: 50.0) * coefficient
    val totalCost = deliveryCost + insuranceCost

    // Задача 3
    val pressure: String? = "1111.25"
    val dataLostError = "ошибка: нет данных о давлении"
    val pressureMessage = pressure ?: dataLostError

}