interface Calculator {
    void add();

    void subtract();
}

class SimpleCalc implements Calculator {
    int a = 20, b = 10;

    public void add() {
        System.out.println("Addition = " + (a + b));
    }

    public void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    public static void main(String args[]) {
        SimpleCalc c = new SimpleCalc();

        c.add();
        c.subtract();
    }
}
