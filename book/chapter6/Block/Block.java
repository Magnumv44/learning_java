/**
 * Класс демонстрирующий возможность передавать в качестве параметра метода объект.
 *
 * @author Magnum
 */
class Block {
    int a, b, c, volume;

    public Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.volume = a * b * c;
    }

    /*
     Метод возвращающий true если переданный в качестве параметра объект
     определяет тот же параллепипед
     */
    boolean sameBlock(Block ob) {
        if ((ob.a == this.a) & (ob.b == this.b) & (ob.c == this.c)) {
            return true;
        } else {
            return false;
        }
    }

    /*
     Метод возвращающий true если переданный в качестве параметра объект
     определяет параллепипед того же объема
     */
    boolean somaVolume(Block ob) {
        if (ob.volume == this.volume) {
            return true;
        } else {
            return false;
        }
    }

}
