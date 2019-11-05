/*
 * Класс наследуемы от суперкласса Sup.
 * Содержит свой переопределенный метод who().
 *
 * @author Magnum
 */
class Sub2 extends Sup {

    @Override
    public void who() {
        System.out.println("who() в Sub2");
    }
}
