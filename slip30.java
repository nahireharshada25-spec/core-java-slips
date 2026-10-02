class MyNumber {
    private int num;

    MyNumber() {
        num = 0;
    }

    MyNumber(int n) {
        num = n;
    }

    void isNegative() {
        System.out.println("Negative: " + (num < 0));
    }

    void isPositive() {
        System.out.println("Positive: " + (num > 0));
    }

    void isOdd() {
        System.out.println("Odd: " + (num % 2 != 0));
    }

    void isEven() {
        System.out.println("Even: " + (num % 2 == 0));
    }

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);

        MyNumber obj = new MyNumber(n);

        System.out.println("Number = " + n);

        obj.isNegative();
        obj.isPositive();
        obj.isOdd();
        obj.isEven();
    }
}
