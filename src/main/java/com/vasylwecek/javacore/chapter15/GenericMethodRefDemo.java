package chapter15;

// Продемонстрировать применение ссылки на обобщенный метод,
// объявленный в необобщенном классе

// Функциональный интерфейс для обработки массива значений
// и возврата целочисленного результата
public class GenericMethodRefDemo {
    interface MyFunc<T> {
        int func(T[] vals, T v);
    }

    /*
    В этом классе определяется метод countMatching(), возвращающий
    количество элементов в массиве, равных указанному значению.
    Обратите внимание на то, что метод countMatching() является
    обобщенным, тогда как класс MyArrayOps - необобщенным.
    */
    static class MyArrayOps {
        static <T> int countMatching(T[] vals, T v) {
            int count = 0;
            for (int i = 0; i < vals.length; i++) {
                if (vals[i].equals(v)) count++;
            }
            return count;
        }
    }

    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"one", "two", "three", "two"};
        int count;

        count = myOp(MyArrayOps::countMatching, vals, 4);
        System.out.println("Массив vals содержит " + count + " числа 4");

        count = myOp(MyArrayOps::countMatching, strs, "two");
        System.out.println("Массив strs содержит " + count + " числа 'two'");
    }
}
