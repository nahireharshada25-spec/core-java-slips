import java.util.*;

class Employee {
    int id;
    String name;
    double Salary;

    void getData() {
        Scanner s = new Scanner(System.in);

        System.out.println("enter id:");
        id = s.nextInt();

        System.err.println("enter name:");
        name = s.next();

        System.out.println("enter salary:");
        Salary = s.nextDouble();
    }
}

class slip9 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter number of employess:");
        int n = s.nextInt();

        Employee e[] = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();
            System.out.println("\nemployee" + (i + 1));
            e[i].getData();

        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (e[i].Salary > e[max].Salary)
                max = i;
        }
        System.out.println("\nemployee having maximum salary:");
        System.out.println(e[max].name);

    }
}
