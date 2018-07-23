/*
 * Программа денстрирующая принцип создания класса c 1-м методом.
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

    // Метод расчитывающий и отображающий дальность поездки
    void range() {
    	System.out.println("Дальность - " + fuelcap * mpg + " миль.");
    }
}

/**
 * Класс в котором создается два объекта класса Vehicle
 * и используется его метод для расчета дальности поездки.
 */
class AddMeth {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		// Присваиваем значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присваиваем значения полям в объекте sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		System.out.print("Мини-фургон может перевезти " +
			minivan.passengers + " пассажиров. ");

		minivan.range(); // Отображаем на экран дальносить поездки мини-фургона используя метод класса Vehicle

		System.out.print("Спортивный автомобиль может перевезти " +
			sportcar.passengers + " пассажиров. ");

		sportcar.range(); // Отображаем на экран дальносить поездки спортивного автомобиля используя метод класса Vehicle
	}
}
