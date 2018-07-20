/*
 * Программа денстрирующая принцип создания класса.
 * Который будет иметь три объкта, и ин из который получет ссылку на другой объект.
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
 * Класс в котором создаются три объекта типа Vehicle.
 * Второму объекту присвается ссылка на первый, затем
 * второму объекту присваевается ссылка на третий объект
 * и все выводится на экран, что бы наглядно продемонстрировать изменения.
 */
class ReferenceTypeDemo {
	public static void main(String[] args) {
		Vehicle car1 = new Vehicle();        // Создается первый объект car1
		Vehicle car2 = car1;                 // Создается второй объект car2 и присваевается ему ссылка на первый обект car1

		car1.passengers = 5;                 // Присваевается значение переменной passengers объекта car1 типа Vehicle

		System.out.println(car1.passengers); // Выводим на экран значение car1.passengers
		System.out.println(car2.passengers); // Переменная car2.passengers выведет на экран тоже, что и car1.passengers

		Vehicle car3 = new Vehicle();        // Создается третий объект типа Vehicle
		car2 = car3;                         // Объекту car2 привается ссылка на объект car3

		car3.passengers = 3;                 //Присвается значение переменной passengers объекта car3 типа Vehicle

		System.out.println(car3.passengers); // Выводим на экран значение car1.passengers
		System.out.println(car2.passengers); // Переменная car2.passengers выведет на экран тоже, что и car3.passengers
	}
}
