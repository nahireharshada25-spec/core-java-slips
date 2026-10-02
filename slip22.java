interface Test {
    void display();
}

class Product implements Test {
    int product_id, product_cost, product_quantity;
    String product_name;

    static int count = 0;

    // Default constructor
    Product() {
        product_id = 0;
        product_name = "Unknown";
        product_cost = 0;
        product_quantity = 0;
        count++;
    }

    // Parameterized constructor
    Product(int id, String name, int cost, int quantity) {
        product_id = id;
        product_name = name;
        product_cost = cost;
        product_quantity = quantity;
        count++;
    }

    public void display() {
        System.out.println("ID: " + product_id);
        System.out.println("Name: " + product_name);
        System.out.println("Cost: " + product_cost);
        System.out.println("Quantity: " + product_quantity);
        System.out.println();
    }

    public static void main(String args[]) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop", 50000, 2);
        Product p3 = new Product(102, "Mouse", 500, 5);

        p1.display();
        p2.display();
        p3.display();

        System.out.println("Object Count = " + count);
    }
}
