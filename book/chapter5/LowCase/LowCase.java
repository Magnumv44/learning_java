/*
 * Программа преобразовывающая прописные буквы в строчные с помощью побитового "или".
 *
 * @author Magnum
 */
class LowCase {
	public static void main(String[] args) {
		char ch;

		for (int i = 0; i < 10; i++) {
			ch = (char) ('A' + i);
			System.out.print(ch);

			// Устанавливаем шестой бит в еденицу для изменения буквы с прописной в строчную
			ch = (char) ((int) ch | 32); // 32 в двоичном представлении 0000000000100000
			System.out.print(ch + " ");
		}
	}
}