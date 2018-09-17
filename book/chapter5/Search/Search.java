/*
 * Пример демонстрирующий приминение цикла for-each для поиска элемента в массиве.
 *
 * @author Magnum
 */
class Search {
	public static void main(String[] args) {
		int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
		int val = 5;

		// Применяем цикл for-each для поиска элемента путем перебора
		for (int x : nums) {
			if (x == val) {
				System.out.println("Значение найдено!");
				break;
			}
		}
	}
}