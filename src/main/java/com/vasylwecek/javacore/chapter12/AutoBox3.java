package chapter12;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Иcxoднoe значение iOb: " + iOb);

        ++iOb;
        System.out.println("Пocлe ++iOb: " + iOb);

        iOb2 = iOb + ( iOb / 3);
        System.out.println("iOЬ2 после выражения: " + iOb2);

        i = iOb + (iOb / 3);
        System.out.println("i после выражения:  " + i);
    }
}
