/*
 * Программа демонстрирующая создание класа с конструктором.
 *
 * @author Vitaly Magnum
 */

/**
 * Клас содержищий в себе конструктор MyClass.
 */
class MyClass {
	int x;

	MyClass() {
		x = 10;
	}
}

/**
 * Клас в котором демонстрируется как именно проходит обращение к конструктору MyClass.
 */
class ConsDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();

        // Выводим на экран переменную x обратиший к ней через конструктор
		System.out.println(t1.x + " " + t2.x);
	}
}