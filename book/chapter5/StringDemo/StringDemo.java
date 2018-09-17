/*
 * Пример демонстрирующий создание и вывод на экрас строк.
 *
 * @author Magnum
 */
class StringDemo {
	public static void main(String[] args) {
		// Разные способы создания и инициализации строк
		String str1 = new String("В Java строки - объекты.");
		String str2 = "их можно создавать разными способами.";
		String str3 = new String(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}