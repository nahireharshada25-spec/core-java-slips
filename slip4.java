import java.util.*;

class slip4 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int ch;

        System.out.println("enter matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = s.nextInt();

        System.out.println("enter matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = s.nextInt();

        do {
            System.out.println("\n1.addition");
            System.out.println("2.multiplication");
            System.out.println("3.transpose");
            System.out.println("4.exit");

            System.out.println("enter choice:");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.err.println("Addition:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        System.out.println();
                    }
                    break;

                case 2:
                    System.err.println("multiplication:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print((a[i][0] * b[0][j] + a[i][1] * b[1][j]) + " ");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.err.println("transpose:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++)
                            System.out.print(a[j][i] + " ");
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("invalid choice:");

            }
        } while (ch != 4);
    }
}
