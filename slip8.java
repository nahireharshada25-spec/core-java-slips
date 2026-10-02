abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("area of rectangle=" + a * b);
    }
}

class Triangle extends Shape {
    Triangle(int x, int y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("area of triangle=" + a * b / 2);
    }
}

class Circle extends Shape {
    Circle(int x) {
        a = x;

    }

    void printArea() {
        System.out.println("area of circle=" + 3.14 * a * a);
    }
}

class slip8 {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);
        Circle c = new Circle(5);

        r.printArea();
        t.printArea();
        c.printArea();

    }
}
