import java.util.*;

class InvalidDateException extends Exception {
    InvalidDateException(String msg) {
        super(msg);
    }
}

class MyDate {
    int day, month, year;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day: ");
        day = sc.nextInt();

        System.out.print("Enter Month: ");
        month = sc.nextInt();

        System.out.print("Enter Year: ");
        year = sc.nextInt();
    }

    void display() throws InvalidDateException {
        if (month < 1 || month > 12 || day < 1)
            throw new InvalidDateException("InvalidDateException");

        int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            days[1] = 29;

        if (day > days[month - 1])
            throw new InvalidDateException("InvalidDateException");

        System.out.println("Date = " + day + "/" + month + "/" + year);
    }

    public static void main(String args[]) {
        MyDate d = new MyDate();

        d.accept();

        try {
            d.display();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
