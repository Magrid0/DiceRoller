import java.util.Scanner;

public class Main {

    static class GlobalVariables { // Declare global variables.
        public static int choice;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Initialize scanner.

        System.out.println("Dice Roller by Magrid0\n"); // Welcome the user.

        boolean exit = false; // Declare exit variable.

        while (!exit) {
            // Choose the dice.
            System.out.println("\n[1] Six Faces (d6)");
            System.out.println("[2] Eight Faces (d8)");
            System.out.println("[3] Ten Faces (d10)");
            System.out.println("[4] Twelve Faces (d12)");
            System.out.println("[5] Twenty Faces (d20)");
            System.out.println("[6] Thirty Faces (d30)");
            System.out.println("[7] Exit");
            System.out.print("\nSelect a type of dice: ");
            GlobalVariables.choice = Integer.parseInt(scanner.nextLine());

            // Validate the user's choice.
            while (GlobalVariables.choice < 1 || GlobalVariables.choice > 7) {
                System.out.print("Invalid choice. Please enter a valid choice (1-7): ");
                GlobalVariables.choice = Integer.parseInt(scanner.nextLine());
            }

            switch (GlobalVariables.choice) {
                case 1 -> Roller.d6(); // Call the method to roll a 6-sided dice.
                case 2 -> Roller.d8(); // Call the method to roll an 8-sided dice.
                case 3 -> Roller.d10(); // Call the method to roll a 10-sided dice.
                case 4 -> Roller.d12(); // Call the method to roll a 12-sided dice.
                case 5 -> Roller.d20(); // Call the method to roll a 20-sided dice.
                case 6 -> Roller.d30(); // Call the method to roll a 30-sided dice.
                case 7 -> exit = true; // Exit the program.
                default -> System.out.println("Invalid choice"); // Notify the user of an invalid choice.
            }
        }

        // Close scanner.
        scanner.close();
    }

}
