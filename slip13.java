import java.util.*;

class slip13 {
    int h, m, s;

    // Constructor
    slip13(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    void check() {
        if (h < 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59) {
            System.out.println("Invalid Time");
        } else {
            System.out.println("Valid Time");

            if (h == 0)
                System.out.println("Time = 12:" + m + ":" + s + " AM");
            else if (h < 12)
                System.out.println("Time = " + h + ":" + m + ":" + s + " AM");
            else if (h == 12)
                System.out.println("Time = 12:" + m + ":" + s + " PM");
            else
                System.out.println("Time = " + (h - 12) + ":" + m + ":" + s + " PM");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hours: ");
        int h = sc.nextInt();

        System.out.print("Enter Minutes: ");
        int m = sc.nextInt();

        System.out.print("Enter Seconds: ");
        int s = sc.nextInt();

        Clock c = new Clock(h, m, s);
        c.check();
    }
}
