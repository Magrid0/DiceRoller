import java.util.Scanner;

public class Main {

    static class GlobalVariables { // Declare global variables.
        public static int choice;
    }

    public static void main(String[] args) {

        // Initialize scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dice Roller by Magrid0"); // Welcome the user.

        boolean exit = false; // Declare exit variable.

        while (!exit) {

            // Choose the dice.
            System.out.println("[1] Six Faces (d6)");
            System.out.println("[2] Eight Faces (d8)");
            System.out.println("[3] Ten Faces (d10)");
            System.out.println("[4] Twelve Faces (d12)");
            System.out.println("[5] Twenty Faces (d20)");
            System.out.println("[6] Thirty Faces (d30)");
            System.out.println("[7] Exit");
            System.out.print("Select a type of dice: ");
            GlobalVariables.choice = Integer.parseInt(scanner.nextLine());

            // Validate the user's choice.
            while (GlobalVariables.choice < 1 || GlobalVariables.choice > 7) {
                System.out.println("Invalid choice. Please enter a valid choice (1-7).");
                GlobalVariables.choice = Integer.parseInt(scanner.nextLine());
            }

            switch (GlobalVariables.choice) {

                case 1 -> Roller.d6();

                case 2 -> Roller.d8();

                case 3 -> Roller.d10();

                case 4 -> Roller.d12();

                case 5 -> Roller.d20();

                case 6 -> Roller.d30();

                case 7 -> exit = true;

                default -> System.out.println("Invalid choice");

            }

        }

        // Close scanner.
        scanner.close();

    }

}