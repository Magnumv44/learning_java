/*
 * Демонстрация времени жизни переменной
 */
class VarInitDemo {
	public static void main(String[] args) {
		int x;

		for (x = 0; x < 3; x++) {
			int y = -1;
			System.out.println("y: " + y);

			y = 100;
            System.out.println("измененное значение y: " + y);
		}
	}
}