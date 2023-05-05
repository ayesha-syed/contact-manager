import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contactList;

    // Constructor
    public ContactManager() {
        this.contactList = new ArrayList<>();
    }

    // Add a new contact to the list
    public void addContact(String name, String email, String phoneNumber, String address) {
        Contact newContact = new Contact(name, email, phoneNumber, address);
        contactList.add(newContact);
        System.out.println("New contact added: " + newContact);
    }

    // Edit an existing contact
    public void editContact(int index, String name, String email, String phoneNumber, String address) {
        Contact contact = contactList.get(index);
        contact.setName(name);
        contact.setEmail(email);
        contact.setPhoneNumber(phoneNumber);
        contact.setAddress(address);
        System.out.println("Contact updated: " + contact);
    }

    // Delete an existing contact
    public void deleteContact(int index) {
        Contact contact = contactList.get(index);
        contactList.remove(index);
        System.out.println("Contact deleted: " + contact);
    }

    // Display all contacts
    public void displayAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("There are no contacts to display.");
        } else {
            for (Contact contact : contactList) {
                System.out.println(contact);
            }
        }
    }
}
