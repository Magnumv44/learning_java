/*
	Демонстрация применения блоков кода.
	Присвойте файлу с исходным кодом имя BlockDemo.java
 */
class BlockDemo {
	public static void main(String[] args) {
		double i, j, d;

		i = 5;
		j = 10;

		if (i != 0) {
			System.out.println("i не равно нулю");
			d = j / i;
			System.out.println("j / i равно" + d);
		}
	}
}