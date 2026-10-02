import java.util.*;

class slip2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a, b, n, r, sum;

        System.out.print("enter starting number:");
        a = sc.nextInt();

        System.out.print("enter ending number:");
        b = sc.nextInt();

        System.out.println("Armstong number:");

        for (int i = a; i <= b; i++) {
            n = i;
            sum = 0;

            while (n > 0) {
                r = n % 10;
                sum = sum + r * r * r;
                n = n / 10;
            }
            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
