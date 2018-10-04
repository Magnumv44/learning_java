/*
 * Программа демонстрирующая использование поразрядной операции исключающего "или" для шифрования и дешифрования.
 *
 * @author Magnum
 */
class Encode {
	public static void main(String[] args) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		int key = 88;

		System.out.println("исходное сообщение: " + msg);

		// Зашифровываем сообщение
		for (int i = 0; i < msg.length(); i++) {
			encmsg += (char) (msg.charAt(i) ^ key);
		}

		System.out.println("зашифрованное сообщение: " + encmsg);

		// Дешифруем сообщение
		for (int i = 0; i < encmsg.length(); i++) {
			decmsg += (char) (encmsg.charAt(i) ^ key);
		}

		System.out.println("дешифрованное сообщение: " + decmsg);
	}
}