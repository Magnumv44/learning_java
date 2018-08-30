/*
 * Демонстрация работы переменной экземпляра length.
 * @author Magnum
 */
class LengthDemo {
	public static void main(String[] args) {
		int list[] = new int[10];
		int nums[] = {1, 2, 3};
		int table[][] = {
			{1, 2, 3},
			{2, 5},
			{6, 7, 8, 9}
		};
		int i;

		System.out.println("Размер массива list" + list.length);
		System.out.println("Размер массива nums" + nums.length);
		System.out.println("Размер массива table" + table.length);
		System.out.println("Размер массива table[0]" + table[0].length);
		System.out.println("Размер массива table[1]" + table[1].length);
		System.out.println("Размер массива table[2]" + table[2].length);
		System.out.println();

		// Применение переменной length для инициализации списка
		for (i = 0; i < list.length; i++) {
			list[i] = i * i;
		}

		System.out.println("Содержимое массива list: ");
		for (i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}
}