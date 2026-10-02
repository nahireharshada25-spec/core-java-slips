import java.util.*;

class College {
    int cno;
    String cname, caddr;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter College No: ");
        cno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter College Name: ");
        cname = sc.nextLine();

        System.out.print("Enter Address: ");
        caddr = sc.nextLine();
    }

    void display() {
        System.out.println("College No: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("Address: " + caddr);
    }
}

class Department extends College {
    int dno;
    String dname;

    void getDepartment() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Department No: ");
        dno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department Name: ");
        dname = sc.nextLine();
    }

    void showDepartment() {
        System.out.println("Department No: " + dno);
        System.out.println("Department Name: " + dname);
    }

    public static void main(String args[]) {
        Department d = new Department();

        d.accept();
        d.getDepartment();

        System.out.println("\nCollege Details:");
        d.display();
        d.showDepartment();
    }
}
