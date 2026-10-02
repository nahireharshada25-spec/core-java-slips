import java.util.*;

abstract class Shape {
    abstract void area();

    abstract void volume();
}

class Cylinder extends Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    void area() {
        System.out.println("Area = " + (2 * 3.14 * r * (r + h)));
    }

    void volume() {
        System.out.println("Volume = " + (3.14 * r * r * h));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        Cylinder c = new Cylinder(r, h);

        c.area();
        c.volume();
    }
}
