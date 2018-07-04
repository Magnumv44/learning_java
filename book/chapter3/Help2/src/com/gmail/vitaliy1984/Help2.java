package com.gmail.vitaliy1984;

/**
 * Файл класса Help2.
 * Программы вывода справочной системы по управляющим конструкциям.
 *
 * @author Виталий Магнум
 * @version 2
 */
public class Help2 {
    public static void main(String[] args)
            throws  java.io.IOException {
        char choise, ignore;

        do {
            System.out.println("Справка:");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while\n");
            System.out.print("Выберите: ");

            choise = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choise < '1' | choise >'5');

        System.out.println("\n");

        switch (choise) {
            case '1':
                System.out.println("Оператор if:\n");
                System.out.println("if (условие) { оператор; }");
                System.out.println("else { оператор; }");
                break;
            case '2':
                System.out.println("Оператор switch:\n");
                System.out.println("switch (выражение){");
                System.out.println("    case константа:");
                System.out.println("        последовательность операторов;");
                System.out.println("        break;");
                System.out.println("    //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Оператор for:\n");
                System.out.println("for (инициализация; условие; итерация) {");
                System.out.println("    оператор;");
                System.out.println("}");
                break;
            case '4':
                System.out.println("Оператор while:\n");
                System.out.println("while (условие) { оператор; }");
                break;
            case '5':
                System.out.println("Оператор do-while:\n");
                System.out.println("do {");
                System.out.println("    оператор");
                System.out.println("} while (условие);");
                break;
        }
    }
}
