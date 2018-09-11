/*
 * Программа демонстрирующая использование цикла for-each.
 *
 * @author Magnum
 */
class ForEach {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};
		int sum = 0;

		// Применяем цикл for-each для суммирования и отображения значений массива
		for (int x : nums) {
			System.out.println("Значение: " + x);
			sum += x;
		}

		System.out.println("Сумма всех элементов массива равна: " + sum);
	}
}