/*
 * Программа демонстрирующая использование массива строк.
 *
 * @author Magnum
 */
class StringArrays {
	public static void main(String[] args) {
		String strs[] = {"Эта", "строка", "является", "тестом."};

		System.out.println("исходный массив:");
		for (String s : strs) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		// изменяем некоторые элементы массива
		strs[2] = "также явлется";
		strs[3] = "тестом!";

		System.out.println("измененный массив:");
		for (String s : strs) {
			System.out.print(s + " ");
		}
	}
}