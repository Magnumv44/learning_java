/*
 * Пример демонстрирующий работу цикла for-each для обработки многомерных массивов.
 *
 * @author Magnum
 */
class ForEach2 {
	public static void main(String[] args) {
		int sum = 0;
		int nums[][] = new int[3][5];

		// Заполняем многомерній массив данными
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = (i + 1) * (j + 1);
			}
		}

		// Применяем for-each для суммирования и отображения значений
		for (int x[] : nums) {  // Особое внимание на то как объявлена переменная x, она сожержит ссылку на одномерный массив
			for (int y : x) {
				System.out.println("Значение: " + y);
				sum += y;
			}
		}

		System.out.println("Сумма: " + sum);
	}
}
