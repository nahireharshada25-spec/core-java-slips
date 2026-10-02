import java.util.*;

class Person {
    String Personname, Aadharno, Panno;

    Person(String name, String aadhar, String pan) {
        this.Personname = name;
        this.Aadharno = aadhar;
        this.Panno = pan;
    }

    void display() {
        System.out.println("Person Name: " + Personname);
        System.out.println("Aadhar No: " + Aadharno);
        System.out.println("PAN No: " + Panno);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEnter Person " + i + " Information:");

            System.out.print("Person Name: ");
            String name = sc.nextLine();

            System.out.print("Aadhar No: ");
            String aadhar = sc.nextLine();

            System.out.print("PAN No: ");
            String pan = sc.nextLine();

            Person p = new Person(name, aadhar, pan);

            System.out.println("Information:");
            p.display();
        }
    }
}
