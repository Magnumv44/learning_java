/*
 * Программа демонстрирующая пузырьковую сортировку массива.
 * @author Magnum
 */
class Bubble {
	public static void main(String[] args) {
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int a, b, t, size;

		size = 10; // Количество элементов подлежащих сортировке

		// Выводим на эран исходный массив
		System.out.print("Оригинальный массив: ");

		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}

		System.out.println();

		// Реализовываем алгоритм сортировки методом пузырька
		for (a = 1; a < size; a++) {
			for (b = size - 1; b >= a; b--) {
				if (nums[b - 1] > nums[b]) { //Если требуемы порядок не соблюден, то меняем элементы местами
					t = nums[b - 1];
					nums[b - 1] = nums[b];
					nums[b] = t;
				}
			}
		}

		System.out.print("Отсортированный массив: ");

		for (int i = 0; i < size; i++) {
			System.out.print(" " + nums[i]);
		}
	}
}