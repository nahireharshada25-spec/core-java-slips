import java.util.*;

class Vehicle {
    String company;
    int price;
}

class LightMotorVehicle extends Vehicle {
    int mileage;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter company:");
        company = s.next();

        System.out.println("enter price:");
        price = s.nextInt();

        System.out.println("enter mileage:");
        mileage = s.nextInt();
    }

    void display() {
        System.out.println("company=" + company);
        System.out.println("price=" + price);
        System.out.println("mileage=" + mileage);

    }
}

class HeavyMotorVehicle extends Vehicle {
    int capacity;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("enter company:");
        company = s.next();

        System.out.println("enter price:");
        price = s.nextInt();

        System.out.println("enter capacity in tons:");
        capacity = s.nextInt();
    }

    void display() {
        System.out.println("company=" + company);
        System.out.println("price=" + price);
        System.out.println("capacity=" + capacity + "Tons");
    }
}

class slip11 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter number of vehicles:");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\n1.Light motor vehicle");
            System.out.println("\n2.heavy motor vehicle");
            System.out.println(".enter vehicle types");
            int type = s.nextInt();

            if (type == 1) {
                LightMotorVehicle l = new LightMotorVehicle();
                l.input();
                l.display();
            } else {
                HeavyMotorVehicle h = new HeavyMotorVehicle();
                h.input();
                h.display();

            }
        }
    }
}
