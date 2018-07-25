/*
 * Программа денстрирующая принцип создания класса c методом принимающим 2-а параметр.
 *
 * @author Vitaliy Magnum
 */

/**
 * Класс описывающий объект Factor.
 */
class Factor {

	/* метод возвращающий логиечекое true
	 * если a является делителем b.
	 */
	boolean isFactor(int a, int b) {
		if ((b % a) == 0) {
			return true;
		} else {
			return false;
		}
	}
}

/**
 * Класс демонстрирующий работу метода с параметрами.
 */
class IsFact {
	public static void main(String[] args) {
		Factor e = new Factor();

		if (e.isFactor(2, 20)) {
			System.out.println("2 - делитель");
		}

		if (e.isFactor(3, 20)) {
			System.out.println("Эта строка не будет выведена");
		}
	}
}