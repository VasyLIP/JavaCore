package chapter04;

/**
 * Динамическая инициализация
 */
public class DynInit {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Gipoteza equal " + c);

    }
}
