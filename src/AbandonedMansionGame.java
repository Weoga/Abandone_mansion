import java.util.Scanner;

public class
AbandonedMansionGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isGameOver = false;

        System.out.println("You wake up in a dusty room, surrounded by decaying furniture.");

        while (!isGameOver) {
            System.out.println("Options:");
            System.out.println("1. Search for clues");
            System.out.println("2. Check the door");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("As you search the room, you find a torn diary page and a rusty key.");
                    System.out.println("Options:");
                    System.out.println("1. Read the diary page");
                    System.out.println("2. Inspect the rusty key");

                    int clueChoice = scanner.nextInt();

                    switch (clueChoice) {
                        case 1 -> {
                            System.out.println("The diary page reveals a tragic love story and mentions a hidden treasure in the abandoned mansion.");
                            System.out.println("Options:");
                            System.out.println("1. Continue searching for the treasure");
                            System.out.println("2. Ignore the diary and explore further");
                            int treasureChoice = scanner.nextInt();
                            if (treasureChoice == 1) {
                                System.out.println("You continue searching for the treasure...");
                                // Continue the storyline based on the player's choice
                                isGameOver = true;
                            } else {
                                System.out.println("You decide to ignore the diary and explore the mansion further...");
                                // Continue the storyline based on the player's choice
                                isGameOver = true;
                            }
                        }
                        case 2 -> {
                            System.out.println("The rusty key seems to fit a nearby locked door.");
                            System.out.println("Options:");
                            System.out.println("1. Unlock the door and continue exploring");
                            System.out.println("2. Leave the key behind and explore elsewhere");
                            int keyChoice = scanner.nextInt();
                            if (keyChoice == 1) {
                                System.out.println("You unlock the door and continue exploring, you see a strange looking mat on the floor");
                                // Continue the storyline based on the player's choice
                                isGameOver = true;
                            } else {
                                System.out.println("You leave the key behind and explore elsewhere...");
                                // Continue the storyline based on the player's choice
                                isGameOver = true;
                            }
                        }
                        default -> System.out.println("Invalid choice!");
                    }
                    break;

                case 2:
                    System.out.println("The door is locked, but you notice a keyhole.");
                    System.out.println("Options:");
                    System.out.println("1. Use the rusty key to unlock the door");
                    System.out.println("2. Go back and search the room");

                    int doorChoice = scanner.nextInt();

                    if (doorChoice == 1) {
                        System.out.println("You use the rusty key to unlock the door...");
                        // Continue the storyline based on the player's choice
                        isGameOver = true;
                    } else {
                        System.out.println("You go back and search the room...");
                        // Continue the storyline based on the player's choice
                        isGameOver = true;
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }

        // Game over, perform necessary actions
        System.out.println("Game over!");
        scanner.close();
    }
}
