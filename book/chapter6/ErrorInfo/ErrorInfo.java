/**
 * Класс ErrorInfo.
 * В котором содератся массив строк с описанием ошибок, и метод возвращающий объект Err содержащий ошибку и ее код.
 *
 * @author Magnum
 */
class ErrorInfo {
    private String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    private int howbad[] = {3, 3, 2, 4};

    // метод возвращающий объект класса Err в с параметрами для конструктора
    public Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length) {
            return new Err(msgs[i], howbad[i]);
        } else {
            return new Err("Несуществущий код ошибки", 0);
        }
    }
}