/*
 * Пример присваивания ссылки на один и тот же массив двум разным переменным.
 * @author Magnum
 */
class AssingARef {
	public static void main(String[] args) {
		int i;
		int nums1[] = new int[10];
		int nums2[] = new int[10];

		// Заполняем значения первого массива
		for (i = 0; i < 10; i++) {
			nums1[i] = i;
		}

		// Заполняем значения второго массива
		for (i = 0; i < 10; i++) {
			nums2[i] = -i;
		}

		// Выводим на экран значения первого массива
		System.out.print("Массив nums1: ");
		for (i = 0; i < 10; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();

		// Выводим на экран значения второго массива
		System.out.print("Массив nums2: ");
		for (i = 0; i < 10; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();

		nums2 = nums1; // Теперь обе переменные ссылаются на один и тот же массив nums1

		// Выводим на экран значения массива nums2 после присвоения
		System.out.print("Массив nums2: ");
		for (i = 0; i < 10; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();

		// Меняем одно из значений в массиве
		nums2[3] = 99;

		// Выводим на экран значения первого массива nums1 после изменений внесенных в nums2
		System.out.print("Массив nums1: ");
		for (i = 0; i < 10; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
	}
}