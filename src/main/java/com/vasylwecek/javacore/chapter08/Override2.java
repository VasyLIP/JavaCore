package chapter08;

class A6 {
    int i, j;

    A6(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {
    public static void main(String args[]) {
        B6 subOb = new B6(1, 2, 3);

        subOb.show("Это k: ");
        subOb.show();
    }
}
