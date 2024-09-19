package biz.evlampiy.biz.evlampiy.kotlincourse.lesson5



fun main () {
    soundFading(startSoundIntensity = 50.0, coef = 0.3)
    soundFading(startSoundIntensity = 50.0, coef = null)
    deliveryPrice(default = 30.0, cargo = 100.0)
    deliveryPrice(default = 30.0, cargo = null)
    measurments(temperature = "20°C, ", humidity = "50%, ", pressure = "760 mmHg")
    measurments(temperature = null, humidity = "50%, ", pressure = "760 mmHg")
    measurments(temperature = "20°C, ", humidity = null, pressure = "760 mmHg")
    measurments(temperature = "20°C, ", humidity = "50%, ", pressure = null)
}

fun soundFading(startSoundIntensity: Double, coef: Double?) {

    println(startSoundIntensity * (coef ?: 0.5))

}

fun deliveryPrice(default: Double, cargo: Double?) {
    var cargoInsurance = 0.005 * (cargo ?: 50.0)

    println(default + cargoInsurance)
}

fun measurments(temperature: String?, humidity: String?, pressure: String?) {
    var tempValue =  temperature ?: ""
    var humidValue = humidity ?: ""
    var message = pressure ?: throw Exception("Уволить лаборанта!😡")
    println(tempValue + humidValue + message)
}