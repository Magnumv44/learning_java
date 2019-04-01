/*
 * Программа демонстрирующа наглядно зачем используются модификаторы доступа.
 * На примере создания массива и предотвращение выхода за пределе массива.
 *
 * @author Magnum
 */
class FailSoftArray {
    private int a[];    // переменная содержащая ссылку на массив
    private int errval; // значение, возвращаемое методом get() при возникновении ошибки
    public int length;  // переменная содержащая значение динны массива

    /*
     Конструктор для сздания массива, содержащий его длинну
     и значение возвращаемое в случае получения ошибки
     */
    public FailSoftArray(int size, int errv) {
        this.length = size;
        this.a = new int[size];
        this.errval = errv;
    }

    // метод возвращающий значение из массива по индексу
    public int get(int index) {
        // проверяем не выходит ли полученное значение за пределы массива
        if (indexOk(index)) {
            return a[index];
        } else {
            return errval;
        }
    }

    /*
     Метод принимащий индекс массива и значение по заданному индексу
     и возвращающий true если операция прошла успешно,
     и false если произошел выход за пределы массива
     */
    public boolean put(int index, int val) {
        if (indexOk(index)) {
            a[index] = val;
            return true;
        } else {
            return false;
        }
    }

    // метод проверяющий не выходит ли значение индекса массива за его приделы
    private boolean indexOk(int index) {
        if (index >= 0 & index < a.length) {
            return true;
        } else {
            return false;
        }
    }

}