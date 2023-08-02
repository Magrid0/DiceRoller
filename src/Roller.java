import java.util.Random;

// Roller class, it handles the generation of random numbers.
public class Roller {

    static Random random = new Random(); // Create an instance of Random class.

    // Roll a 6-sided dice and print the result.
    public static void d6() {
        int min = 1; // Minimum value of the range
        int max = 6; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-6): " + randomNumber); // Print the number.
    }

    // Roll an 8-sided dice and print the result.
    public static void d8() {
        int min = 1; // Minimum value of the range
        int max = 8; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-8): " + randomNumber); // Print the number.
    }

    // Roll a 10-sided dice and print the result.
    public static void d10() {
        int min = 1; // Minimum value of the range
        int max = 10; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-10): " + randomNumber); // Print the number.
    }

    // Roll a 12-sided dice and print the result.
    public static void d12() {
        int min = 1; // Minimum value of the range
        int max = 12; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-12): " + randomNumber); // Print the number.
    }

    // Roll a 20-sided dice and print the result.
    public static void d20() {
        int min = 1; // Minimum value of the range
        int max = 20; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-20): " + randomNumber); // Print the number.
    }

    // Roll a 30-sided dice and print the result.
    public static void d30() {
        int min = 1; // Minimum value of the range
        int max = 30; // Maximum value of the range

        // Generate a random number within the range (min to max, inclusive).
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("\nRandom number within the range(1-30): " + randomNumber); // Print the number.
    }
}
