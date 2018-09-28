/*
 * Программа демонстрирующая работу поразрядных операций "и", "или", "исключающее или"" и "не".
 * На примере преобразования строчных букв в прописные.
 *
 * @author Magnum
 */
class UpCase {
	public static void main(String[] args) {
		char ch;

		for (int i = 0; i < 10; i++) {
			ch = (char) ('a' + i);
			System.out.print(ch);

			// Теперь сбрасываем шестой бит в коде символа для преобразования его в прописной символ
			ch = (char) ((int) ch & 65503);

			System.out.print(ch + " ");
		}
	}
}