import java.util.*;
import StringOperation.*;

class test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first string: ");
        String a = sc.nextLine();

        System.out.println("enter second string:");
        String b = sc.nextLine();

        concatenate c = new concatenate();
        compare p = new compare();

        c.con(a, b);
        p.comp(a, b);
    }
}
