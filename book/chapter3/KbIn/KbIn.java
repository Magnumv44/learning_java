/*
 * Пример программы считывающей символы введенные пользователем с клавиатуры.
 */
class KbIn {
	public static void main(String args[])
		throws java.io.IOException {
			char ch;

			System.out.print("Нажмите нужную клавишу, а затем нажмите клавишу ENTER: ");

			ch = (char) System.in.read(); //Получение символов с клавиатуры

			System.out.println("Вы нажали клавишу " + ch);
	}
}