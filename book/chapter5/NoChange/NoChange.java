/*
 * Программа демонстрирующая важную особенность цикла for-each.
 * А именно, невозможность изменения в нем данных на примере массива.
 * Данная разновидность цикла используется для чтения даннх, но не записи.
 * 
 * @author
 */
class NoChange {
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for (int x : nums) {
			System.out.print(x + " ");
			x = x * 10;
		}

		System.out.println();

		for (int x : nums) {
			System.out.print(x + " ");
		}
	}
}