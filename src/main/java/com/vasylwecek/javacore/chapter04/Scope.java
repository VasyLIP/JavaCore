package chapter04;

/**
 * Область и срок действия переменных
 */
public class Scope {
    public static void main(String[] args) {
        int x; // эта переменная доступна всему коду из метода lln()

        x = 10;
        if (x == 10){ // начало новой области действия
            int y = 20; // доступной только этому блоку кода

            // обе переменные х и у доступны в этой области действия

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;

        }

        // y = 100; // ОШИБКА! переменная у недоступна
        // в этой области действия, тогда как переменная х доступна и эдесь
        System.out.println("x equal " + x);
    }
}
