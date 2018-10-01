/*
 * Программа демонстрирующая возможные операции над строками.
 *
 * @author
 */
class StrOps {
	public static void main(String[] args) {
		String str1 = "Java - лидер интернета!";
		String str2 = new String(str1);
		String str3 = "Строки Java эффективны";
		int result, idx;
		char ch;

		System.out.println("Длинна строки str1:" + str1.length());

		// Отображаем строку посимвольно с помощью цикла for
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();

		// Узнаем эквивалетны ли строки
		if (str1.equals(str2)) {
			System.out.println("str1 эквавилетна str2");
		} else {
			System.out.println("str1 не эквавилетна str2");
		}

		if (str1.equals(str3)) {
			System.out.println("str1 эквавилетна str3");
		} else {
			System.out.println("str1 не эквавилетна str3");
		}

		// Сравниваем строки на равенство
		result = str1.compareTo(str3);
		if (result == 0) {
			System.out.println("str1 и str3 равны");
		} else if (result < 0) {
			System.out.println("str1 меньше str3");
		} else {
			System.out.println("str1 больше str3");
		}

		// Присваиваем переменной str2 новое значение
		str2 = "One Two Three One";

		// ищем индекс первого вхождение подстроки
		idx = str2.indexOf("One");
		System.out.println("индек первого вхождения One:" + idx);

		// ищем индекс последнего вхождение подстроки
		idx = str2.lastIndexOf("One");
		System.out.println("индек последнего вхождения One:" + idx);
	}
}