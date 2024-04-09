package lab3;

public class PrimeNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
        }
    }
    // Μέθοδος που ελέγχει αν ο αριθμός είναι πρώτος με αναδρομικό τρόπο
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        return isPrimeRecursive(number, 2);
    }

    // Βοηθητική αναδρομική μέθοδος για τον έλεγχο πρώτου αριθμού
    private static boolean isPrimeRecursive(int number, int divisor) {
        if (divisor >= number) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }

        return isPrimeRecursive(number, divisor + 1);
    }
}
