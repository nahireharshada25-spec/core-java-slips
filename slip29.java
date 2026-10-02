import java.util.*;

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

class slip29 {
    static void check(int n) throws MyException {
        if (n == 0)
            throw new MyException("Number is 0");

        boolean prime = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime && n > 1)
            System.out.println("Number is Prime");
        else
            System.out.println("Number is Not Prime");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        try {
            check(n);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
