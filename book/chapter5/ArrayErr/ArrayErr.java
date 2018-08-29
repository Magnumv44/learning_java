/*
 * Программа в которой демонстрируется, что будет, если произойдет выход за границы массива
 */
class ArrayErr {
	public static void main(String[] args) {
		int sample[] = new int[10];

		for (int i = 0; i < 100; i++) {
			sample[i] = i;
		}
	}
}