/*
 	Демонстрация применения оператора if.
 	Присвойте файлу с исходным кодом имя IfDemo.java
 */
class  IfDemo {
	public static void main(String[] args) {
		int a, b, c;
		a = 2;
		b = 3;

		if (a < b) System.out.println("a меньше b");
		// Следующая строка никогда не может быть выведена
		if (a == b) System.out.println("Вы не должны увидеть этот текс");

		System.out.println();

		c = a - b;

		System.out.println("c содержит значение -1");

		if (c >= 0) System.out.println("c - не отрицательное число");
		if (c < 0) System.out.println("c - отрицательное число");

		System.out.println();

		c = b - a;

		System.out.println("c содержит значение 1");

		if (c >= 0) System.out.println("c - не отрицательное число");
		if (c < 0) System.out.println("c - отрицательное число");
	}
}