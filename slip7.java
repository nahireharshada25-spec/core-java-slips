class AgeException extends Exception {
    AgeException(String a) {
        super(a);
    }
}

class Driver {
    String license_no, name, address;
    int age;

    Driver(String l, String n, String a, int ag) {
        license_no = l;
        name = n;
        address = a;
        age = ag;
    }

    void display() {
        System.err.println("license no:" + license_no);
        System.out.println("name" + name);
        System.out.println("address:" + address);
        System.out.println("age:" + age);
    }
}

class slip7 {
    public static void main(String args[]) {
        Driver d = new Driver("MH12AB1234", "rahul", "pune", 17);

        try {
            if (d.age < 18)
                throw new AgeException("age is below 18 years");

            d.display();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
