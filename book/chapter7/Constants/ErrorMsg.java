/*
 * Класс ErrorMsg.
 * Демонстрирующий работу метода getErrorMsg() который возвращает объект типа String
 * с описанием ошибки, но в качестве аргумента получает не индекс массива, а константу.
 *
 * @version 2
 * @author Magnum
 */
class ErrorMsg {
    public static void main(String[] args) {
        ErrMsg err = new ErrMsg();

        // При вызове метода вместо прямых кодов в качестве аргумента ему передаются константы
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
