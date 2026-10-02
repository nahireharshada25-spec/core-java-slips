package game;

public class Indoor
{
    String game;

    public Indoor()
    {
        game = "Chess";
    }

    public Indoor(String g)
    {
        game = g;
    }

    public void display()
    {
        System.out.println("Indoor Game: " + game);
        System.out.println("Players: Rahul, Amit, Sagar");
    }
}
