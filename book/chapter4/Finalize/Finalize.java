/*
 * Программа денстрирующая принцип работы сборки мусора с помощью метода finalize.
 *
 * @author Vitaliy Magnum
 */

/**
 * Класс в ктором создаются объекты для удаления, содержится метод finalize
 * для демонстрации работы сборщика мусора.
 */
class FDemo {
	int x;

	FDemo(int i) {
		x = i;
	}

	// Вызывается при удалении объкта
	protected void finalize() {
		System.out.println("Финализация " + x);
	}

	// Метод  генерирубщий объкт который сразу же удаляется
	void generator(int i) {
		FDemo o = new FDemo(i);
	}
}

/**
 * Класс в котором проиходит запуск и выполнение программы.
 */
class Finalize {
	public static void main(String[] args) {
		int count;

		FDemo ob = new FDemo(0);

		// Генерируем большое количество объектов для инициализации сборки мусора
		for (count = 1; count < 10000000; count++) {
			ob.generator(count);
		}
	}
}