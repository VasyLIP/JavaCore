package chapter05;

/*
Ternary использует тернарный условный оператор для вычисления абсолютного значения переменной i.
Тернарный оператор в Java имеет формат: условие ? значение_если_истина : значение_если_ложь
 */
public class Ternary {
    public static void main(String[] args) {
        int i , k;
        i = 10;
        k = i < 0 ? -i : i; // тернарный оператор проверяет, является ли i отрицательным числом. Если да (i < 0), то k присваивается значение -i (инвертированное значение i). Если нет, k будет равно i. Поскольку i равно 10, k также становится 10.
        System.out.print("Aбcoлютнoe значение");
        System.out.println(i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значения переменной i
        System.out.println("Aбcoлютнoe значение");

        System.out.println("Aбcoлютнoe значение");
        System.out.println(i + " равно " + k);
    }
}
