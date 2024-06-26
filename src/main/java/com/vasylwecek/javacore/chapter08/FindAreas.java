package chapter08;

// Класс для демонстрации полиморфизма во время выполнения
class FindAreas {
    public static void main(String args[]) {
        Figure r = new Rectangle(9, 5);
        Figure t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }

    abstract static class Figure {
        double dim1;
        double dim2;

        Figure(double a, double b) {
            dim1 = a;
            dim2 = b;
        }

        abstract double area();
    }

    static class Rectangle extends Figure {
        Rectangle(double a, double b) {
            super(a, b);
        }

        double area() {
            System.out.println("В области четырехугольника.");
            return dim1 * dim2;
        }
    }

    static class Triangle extends Figure {
        Triangle(double a, double b) {
            super(a, b);
        }

        double area() {
            System.out.println("В области треугольника.");
            return dim1 * dim2 / 2;
        }
    }

}
