open class Car(carName: String) {
    var engine: String? = null;
    var isCarTurnedOn: Boolean = false;
    private val carName: String = carName;

    fun getCarName(): String {
        return "This car is a $carName"
    }

    fun setEngine(money: Int): String {
        return if (money > 10000) {
            "Electric"
        } else {
            when { money == 0 -> "You dont have enough mone!" };
            "Default Engine"
        }
    }

    fun engine(isCarTurnedOn: Boolean): String {
        if (isCarTurnedOn) {
            return "Engine is working! Vrum!!!"
        } else return "Engine is disabled!"
    }
}