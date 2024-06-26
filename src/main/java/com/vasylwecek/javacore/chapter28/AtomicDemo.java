package chapter28;
import java.util.concurrent.atomic.*;
public class AtomicDemo {
    public static void main(String[] args) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared2{
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable{
    String name;
    AtomThread(String n){
        name = n;
        new Thread(this).start();
    }

    public void run (){
        System.out.println("Запуск потока " + name);
        for (int i = 0; i <= 3; i++)
            System.out.println("Поток " + name + " получено: " + Shared2.ai.getAndSet(i));
    }
}
