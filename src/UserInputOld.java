import java.util.Scanner;

// Η κλάση UserInput χρησιμοποιείται για την εισαγωγή δεδομένων από τον χρήστη
class UserInputOld {
    private static Scanner scanner = new Scanner(System.in);

    // Μέθοδος για ανάγνωση ακεραίων
    public static int getInteger(String prompt) {
        System.out.print(prompt + ": ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        return value;
    }

    // Μέθοδος για ανάγνωση δεκαδικών αριθμών
    public static double getDouble(String prompt) {
        System.out.print(prompt + ": ");
        double value = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return value;
    }

    // Μέθοδος για ανάγνωση αλφαριθμητικών
    public static String getString(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextLine();
    }
}