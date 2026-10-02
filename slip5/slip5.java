import java.io.*;
import java.util.*;

class slip5 {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("enter file name:");
        String name = s.nextLine();

        FileReader f = new FileReader(name);
        String str = "";
        int c;

        while ((c = f.read()) != -1)
            str = str + (char) c;

        f.close();

        System.out.println("reverse and change case:");
        for (int i = str.length() - 1; i >= 0; i--) {
            char x = str.charAt(i);
            if (x >= 'A' && x <= 'Z')
                x = (char) (x + 32);
            else if (x >= 'a' && x <= 'z')
                x = (char) (x - 32);

            System.out.print(x);
        }
    }
}
