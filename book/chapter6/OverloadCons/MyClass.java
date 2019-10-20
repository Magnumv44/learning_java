/*
 * Класс содержащий конструктор и его переопределенные формы для демонстрации переопределения конструкторов.
 *
 * @author Magnum
 */
class MyClass {
    private int x; // переменная private для соблюдения правил инкапсуляции

    MyClass() {
        System.out.println("Внутри конструктора MyClass().");
        this.x = 0;
    }

    MyClass(int i) {
        System.out.println("Внутри конструктора MyClass(int).");
        this.x = i;
    }

    MyClass(double d) {
        System.out.println("Внутри конструктора MyClass(double).");
        this.x = (int) d;
    }

    MyClass(int i, int j) {
        System.out.println("Внутри конструктора MyClass(int, int).");
        this.x = i * j;
    }

    // Геттер для получения значения переменной X соблюдая правила инкапсуляции
    public int getX() {
        return x;
    }
}
