import java.util.Arrays;
import java.util.Scanner;

class slip1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0, temp;

        System.out.println("enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        // for (int i = 0; i < 5; i++) {
        // for (int j = i + 1; j < 5; j++) {
        // if (a[i] > a[j]) {
        // temp = a[i];
        // a[i] = a[j];
        // a[j] = temp;
        // }
        // }
        // }
        Arrays.sort(a);
        System.out.println("sum=" + sum);

        System.out.println("Ascending order");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
