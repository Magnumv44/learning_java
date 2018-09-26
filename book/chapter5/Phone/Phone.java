/*
 * Программа демонстрирующая поиск данных в многомерном строковом массиве, переданных в качестве аргумента комадной строки.
 *
 * @author Magnum
 */
class Phone {
	public static void main(String[] args) {
		String numbers[][] = {
			{"Tom", "555-3322"},
			{"Mary", "555-8976"},
			{"Jon", "555-1037"},
			{"Rachel", "555-1400"}
		};
		int i;

		// Для того что-бы воспользоватся программой,
		// ей нужно передать один аргумент из командной строки.
		if (args.length != 1) {
			System.out.println("использование: java Phone <имя>");
		} else {
			for (i = 0; i < numbers.length; i++) {
				if (numbers[i][0].equals(args[0])) {
					System.out.println(numbers[i][0] + ": " + numbers[i][1]);
					break;
				}
			}

			if (i == numbers.length) {
				System.out.println("имя не найдено.");
			}
		}
	}
}