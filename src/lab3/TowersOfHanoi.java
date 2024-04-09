package lab3;


import lab1.UserInput;

public class TowersOfHanoi {
    public static void main(String[] args) {
        //  int numberOfDisks = 4;
        // Παραλλαγή για 64 και γενικά όσους δίσκους δώσει ο χρήστης.
        int numberOfDisks = UserInput.getInteger("Give the number of disks ");

        // Κλήση της μεθόδου για τη μετακίνηση των δίσκων
        moveDisks(numberOfDisks, 'A', 'C', 'B');
    }

    // Μέθοδος για τη μετακίνηση των δίσκων από μία πύργο σε άλλη
    public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
        if (n == 1) {
            System.out.println("Μετακίνηση δίσκου 1 από " + fromTower + " σε " + toTower);
            return;
        }

        moveDisks(n - 1, fromTower, auxTower, toTower);
        System.out.println("Μετακίνηση δίσκου " + n + " από " + fromTower + " σε " + toTower);
        moveDisks(n - 1, auxTower, toTower, fromTower);
    }
}