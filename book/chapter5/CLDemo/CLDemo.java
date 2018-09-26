/*
 * Программа демонстрирующая отображение всех данных, переданных через командную строку.
 *
 * @author Magnum
 */
class CLDemo {
	public static void main(String[] args) {
		System.out.println("Программе передано " + args.length + " аргументов из командной строки.");

		System.out.println("Список аргументов:");

		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: "+ args[i]);
		}
	}
}