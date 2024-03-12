import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player {
    private int id;
    private String name;
    private int run;

    public Player(int id, String name, int run) {
        this.id = id;
        this.name = name;
        this.run = run;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", run=" + run +
                '}';
    }
}

public class PlayerSortingByComparator {
    public static void main(String[] args) {
        // Create an ArrayList to store Player objects
        ArrayList<Player> players = new ArrayList<>();

        // Add 5 players to the ArrayList
        players.add(new Player(3, "John", 150));
        players.add(new Player(1, "Alice", 200));
        players.add(new Player(5, "Bob", 100));
        players.add(new Player(2, "Eve", 120));
        players.add(new Player(4, "Charlie", 180));

        // Display unsorted player details
        System.out.println("Player Details (Unsorted):");
        for (Player player : players) {
            System.out.println(player);
        }

        // Sort by ID using Comparator
        Collections.sort(players, Comparator.comparingInt(Player::getId));
        System.out.println("\nPlayer Details (Sorted by ID):");
        for (Player player : players) {
            System.out.println(player);
        }

        // Sort by Run using Comparator
        Collections.sort(players, Comparator.comparingInt(Player::getRun));
        System.out.println("\nPlayer Details (Sorted by Run):");
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
