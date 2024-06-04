package chapter13;
import java.io.*;

public class TinyEdit {
    public static void main(String[] args)  throws IOException {


        // InputStreamReader оборачивает System.in для преобразования байтового потока в символьный.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str [] = new String[100];
        System.out.println("Bвeдитe строки текста.");
        System.out.println("Bвeдитe 'стоn' для завершения.");
        for (int i = 0; i<100; i++){
            // Программа считывает строки текста с консоли и сохраняет их в массив str.
            str[i] = br.readLine();
            if(str[i].equals("cтoп")) break;
        }
        System.out.println("\nCoдepжимoe вашего файла ");

        for (int i =0; i<100; i++){
            if(str[i].equals("cтoп"))break;
            System.out.println(str[i]);
        }
    }
}
