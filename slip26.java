import java.util.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class Student {
    String name;
    int roll, total, attended;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        s.roll = sc.nextInt();

        System.out.print("Enter Total Lectures: ");
        s.total = sc.nextInt();

        System.out.print("Enter Attended Lectures: ");
        s.attended = sc.nextInt();

        double per = (s.attended * 100.0) / s.total;

        try {
            if (per < 75)
                throw new MyException("Student is Not Eligible for Exam");

            System.out.println("\nStudent Details");
            System.out.println("Name: " + s.name);
            System.out.println("Roll No: " + s.roll);
            System.out.println("Attendance: " + per + "%");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
