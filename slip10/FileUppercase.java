import java.io.*;

class FileUppercase {
    public static void main(String args[]) throws Exception {
        FileReader f = new FileReader("abc.txt");
        int ch;

        while ((ch = f.read()) != -1) {
            System.out.print(Character.toUpperCase((char) ch));
        }
        f.close();
    }
}
