/*
 * Демоннстрация использования логических значений
 */
class BoolDemo {
	public static void main(String[] args) {
		boolean b;

		b = false;
		System.out.println("Значение и: " + b);

		b = true;
		System.out.println("Значение и: " + b);

		// Логические значения можно использовать для управления условным оператором if
		if (b) System.out.println("Эта инстуркция выполняется");

		b = false;
		if (b) System.out.println("Эта инстуркция не выполняется");

		//В результате выполнения сравления получается логическое значение
		System.out.println("Результат сравнения 10 > 9: " + (10 > 9));
	}
}