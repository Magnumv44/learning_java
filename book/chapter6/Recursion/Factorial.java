/*
 * Клас деменстрирующий создание рекурсивного и итеративного методов.
 * Демонстрируется разница между ними в плане написания и вызова кода
 * для вычесления факториала числа переданного в качестве параметра методу.
 *
 * @author Magnum
 */
class Factorial {
    // рекурсивный метод
    public int factR(int n) {
        int result;

        if (n == 1) return 1;
        result = factR(n - 1) * n; // Рекурсивний вызов метода factR() самим себя
        return result;
    }

    // итеративный метод
    public int factI(int n) {
        int t, result;

        result = 1;
        for (t = 1; t <= n; t++) result *= t;
        return result;
    }
}
