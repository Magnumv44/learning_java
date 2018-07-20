/*
 * Программа денстрирующая принцип создания класса.
 * Который будет иметь два его объкта.
 *
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
 * Класс в котором создается два объекта класса Vehicle.
 */
class TwoVehicles {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		int range1, range2;

		// Присваиваем значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присваиваем значения полям в объекте minivan
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		//Расчитываем дальность поездки для обоих объектов
		range1 = minivan.fuelcap * minivan.mpg;
		range2 = sportcar.fuelcap * sportcar.mpg;

		System.out.println("Мини-фургон может перевезти " +
			minivan.passengers + " пассажиров на росстояние " + range1 +
			" миль");
		System.out.println("Спортивный автомобиль может перевезти " +
			sportcar.passengers + " пассажиров на росстояние " + range2 +
			" миль");
	}
}
