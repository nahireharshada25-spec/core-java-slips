package game;

public class Outdoor {
    String game;

    public Outdoor() {
        game = "Cricket";
    }

    public Outdoor(String g) {
        game = g;
    }

    public void display() {
        System.out.println("Outdoor Game: " + game);
        System.out.println("Players: Rohit, Virat, Hardik");
    }
}
