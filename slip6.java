class Account {
    String custname;
    int accno;

    Account() {
        custname = "ABC";
        accno = 101;
    }

    Account(String n, int a) {
        custname = n;
        accno = a;
    }
}

class SavingAccount extends Account {
    double savingbal, minbal;

    SavingAccount(String n, int a, double s, double m) {
        super(n, a);
        savingbal = s;
        minbal = m;
    }
}

class AccountDetail extends SavingAccount {
    double depositamt, withdrawlamt;

    AccountDetail(String n, int a, double s, double m, double d, double w) {
        super(n, a, s, m);
        depositamt = d;
        withdrawlamt = w;
    }

    void display() {
        System.out.println("customer name:" + custname);
        System.out.println("account number:" + accno);
        System.out.println("saving balance:" + savingbal);
        System.out.println("minimum balance:" + minbal);
        System.out.println("deposit amount:" + depositamt);
        System.out.println("withdrawl amount:" + withdrawlamt);
    }
}

class slip6 {
    public static void main(String args[]) {
        AccountDetail a = new AccountDetail(
                "rahul", 101, 5000, 1000, 2000, 500);
        a.display();
    }
}
