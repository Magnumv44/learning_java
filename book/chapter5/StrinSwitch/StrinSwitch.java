/*
 * Программа демонстрирующая использование строк для управления оператором switch.
 *
 * @author Magnum
 */
class StrinSwitch {
	public static void main(String[] args) {
		String command = "cansel";

		switch(command) {
			case "connect":
			    System.out.println("Подключение");
			    break;
			case "cansel":
			    System.out.println("Отмена");
			    break;
			case "disconnect":
			    System.out.println("Отключение");
			    break;
            default:
			    System.out.println("Неверная команда!");
			    break;
		}
	}
}