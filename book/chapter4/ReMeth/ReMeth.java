/*
 * Программа денстрирующая принцип создания класса c 1-м методом возвращающим значение.
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

    // Метод расчитывающий и возвращающий значение дальности поездки
    int range() {
    	return mpg * fuelcap;
    }
}

/**
 * Класс в котором создается два объекта класса Vehicle
 * и используется его метод для расчета дальности поездки.
 */
class ReMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		int range1, range2;

		// Присваиваем значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присваиваем значения полям в объекте sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		// Получаем дальность поездки используя метод класса Vehicle и выводим его на экран
		System.out.println("Мини-фургон может перевезти " +
			minivan.passengers + " пассажиров на расстояние " + minivan.range() + " миль.");
		System.out.println("Спортивный автомобиль может перевезти " +
			sportcar.passengers + " пассажиров на расстояние " + sportcar.range() + " миль.");
	}
}
