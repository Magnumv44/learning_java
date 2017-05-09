/*
	Демонстрация применения цикла for.
	Присвойте файлу с исходным кодом имя ForDemo.java
 */
class ForDemo {
	public static void main(String[] args) {
		int count;

		for (count = 0; count < 5; count++) //Это цикл выполняет пять итераций
			System.out.println("Значение счетчика: "+ count);

		System.out.println("Готово!");
	}
}