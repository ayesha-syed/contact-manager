import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();

        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete contact");
            System.out.println("4. View all contacts");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    contactManager.addContact(name, email, phoneNumber, address);
                    break;

                case 2:
                    System.out.print("Enter index of contact to edit: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String newAddress = scanner.nextLine();
                    contactManager.editContact(editIndex, newName, newEmail, newPhoneNumber, newAddress);
                    break;

                case 3:
                    System.out.print("Enter index of contact to delete: ");
                    int deleteIndex = scanner.nextInt();
                    contactManager.deleteContact(deleteIndex);
                    break;

                case 4:
                    contactManager.displayAllContacts();
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
