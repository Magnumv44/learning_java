/*
 * Задание:
 * Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.
 *
 * Файлу с исходным кодом присвойте имя WeightOnTheMoon.java
 */
class WeightOnTheMoon {
	public static void main(String[] args) {
		double my_weight = 82;      // Мой вес
		double moon_gravity = 17;   // Сила притяжения на Луне
		double earth_gravity = 100; // Сила притяжение на Земле
		double moon_weight;         // Переменная которая будет хранить в себе вес на Луне

		/* Производим расчет веса на Луне */
		moon_weight = (moon_gravity / earth_gravity) * my_weight;

		/* Выводим на экран результат */
		System.out.print("Мой вес на Луне равен: " + moon_weight + " кг.");
	}
}