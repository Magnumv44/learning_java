/*
 * Программа денстрирующая принцип создания класса и его объкта.

 * @author Vitaliy Magnum
 */

/**
 * Класс описывающий объект Vehicle.
 */
class Vehicle {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // потребление топлива в милях на галон
}

/**
 * Класс в котором создается объект класса Vehicle.
 */
class VehicleDemo {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		int range;

		// присваиваем значение полям (переменным) в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Рассчитываем дальность поездки при полном баке
		range = minivan.fuelcap * minivan.mpg;

		System.out.println("Мини-фургон может перевезти " +
			minivan.passengers + " пассажиров на росстояние " + range +
			" миль");
	}
}
