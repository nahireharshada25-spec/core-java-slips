class Continent {
    String continent = "Asia";
}

class Country extends Continent {
    String country = "India";
}

class State extends Country {
    String state = "Maharashtra";
    String place = "Nashik";

    void display() {
        System.out.println("Place: " + place);
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }

    public static void main(String args[]) {
        State s = new State();
        s.display();
    }
}
