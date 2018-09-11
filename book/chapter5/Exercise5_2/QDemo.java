/*
 * Упражнение 5.2.
 * Демонстрирующий работу нециклического заполнения
 * массива на примере очереди.
 *
 * @author Magnum
 */

/**
 * Клас реализующий очередь для хранения
 */
class Queue {
	char q[];            // массив для хранения элементов
	int putloc, getloc;  // индейсы для вставки и извлечения дпнных массива

    Queue(int size) {
    	q = new char[size + 1];
    	putloc = getloc = 0;
    }

    // Метод помещаюй символ в очередь
    void put(char ch) {
    	if (putloc == q.length-1) {
    		System.out.println(" - Очередь заполнена.");
    		return;
    	}

    	putloc++;
    	q[putloc] = ch;
    }

    // Метод извлекающий символ из очереди
    char get() {
    	if (getloc == putloc) {
    		System.out.println(" - Очередь пуста.");
    		return (char) 0;
    	}

    	getloc++;
    	return q[getloc];
    }
}

/**
 * Класс демонстрирующий как будет работать помещение и извление элементов массива.
 */
class QDemo {
	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		char ch;
		int i;

		System.out.println("Использование очереди bigQ для сохранения алфавита");

		// Заполняем массив буквами
		for (i = 0; i < 26; i++) {
			bigQ.put((char) ('A' + i));
		}

		// Извлекаем символы из массива и выводим их на экран
		System.out.println("Содержимое очереди bigQ: ");

		for (i = 0; i < 26; i++) {
			ch = bigQ.get();

			if (ch != (char) 0) {
				System.out.print(ch);
			}
		}

		System.out.println("\n");

		System.out.println("Использование очереди smallQ для генерации ошибок");

		// Использование очереди smallQ для генерации ошибок
		for (i = 0; i < 5; i++) {
		    System.out.print("Попытка сохранения " + (char) ('Z' - i));

		    smallQ.put((char) ('Z' - i));

		    System.out.println();
		}

		System.out.println();

		// Дополнительные ошибки при обращении к очереди smallQ
		System.out.println("Содержимое smallQ: ");

		for (i = 0; i < 5; i++) {
			ch = smallQ.get();

			if (ch != (char) 0) {
				System.out.print(ch);
			}
		}
	}
}