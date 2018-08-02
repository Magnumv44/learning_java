/*
 * Программа демонстрирующая работу с ключевым словом this.
 */

/**
 * Класс в котором объявляются переменные, создается конструктор и метод
 * с применения ключевого слова this.
 */
class PwrThis {
	double b;
	int e;
	double val;

	PwrThis (double base, int exp) {
		this.b = base;
		this.e = exp;

		this.val = 1;

		if (exp == 0) {
			return;
		}

		for ( ; exp > 0; exp--) {
			this.val = this.val * base;
		}
	}

	double get_pwr() {
		return this.val;
	}
}

/**
 * Клас в котором создаются экземпляры и проиходит вывод на экран стемени числа.
 */
class DemoPwrThis {
	public static void main(String[] args) {
		Pwr x = new Pwr(4.0, 2);
		Pwr y = new Pwr(2.5, 1);
		Pwr z = new Pwr(5.7, 0);

		System.out.println(x.b + " в степени " + x.e +
			               " равно " + x.get_pwr());
		System.out.println(y.b + " в степени " + y.e +
			               " равно " + y.get_pwr());
		System.out.println(z.b + " в степени " + z.e +
			               " равно " + z.get_pwr());
	}
}