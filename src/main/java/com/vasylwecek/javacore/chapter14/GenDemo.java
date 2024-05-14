package chapter14;
// Простой обобщенный класс
// Здесь Т обозначает параметр типа
// который будет заменен реальным типом
// при создании объекта типа Gen

class Gen<T>{
    T ob; // объявить объект типа Т

    // передать конструктору ссылку на объект типа Т
    Gen(T o){
        ob = o;
    }

    // �озвратить объект оЬ
    T getob(){
        return ob;
    }

    // показать тип Т
    void showType(){
        System.out.println("Tипoм Т является " + ob.getClass().getName());

    }
}

// продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {

        // Создать ссылку типа Gen для целых чисел
        Gen<Integer> iOb;

        /*
        Создать объект типа Gen<Integer> и присвоить
        ссылку на него переменной iОЬ. Обратите внимание на
        применение автоупаковки для инкапсуляции значения 88
        в объекте типа Inteqer
         */

        iOb = new Gen<Integer>(88);

        //показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iОЬ. Обратите внимание на то,
        // что для этого не требуется никакого приведения типов

        int v = iOb.getob();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String> strOb = new Gen<String> ("Тест обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb. И в этом случае
        // приведение типов не требуется
        String str = strOb.getob();
        System.out.println("Знaчeниe: " + str);

    }
}
