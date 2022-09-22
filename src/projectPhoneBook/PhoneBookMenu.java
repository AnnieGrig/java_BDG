package projectPhoneBook;

import java.util.Scanner;

public class PhoneBookMenu {

    private final PhoneBook phonebook = new PhoneBookImpl();

    public static void main(String[] args) {
        new PhoneBookMenu().menu();
    }

    private void menu() {

        boolean exit = false;

        while (!exit) {
            Contact contact;
            Scanner scan = new Scanner(System.in);
            showOptions();

            switch (scan.nextInt()) {
                case 1:
                    contact = createContact();
                    phonebook.add(contact);
                    break;
                case 2:
                    int id = getContactID();
                    contact = phonebook.find(id);
                    System.out.println(contact);
                    break;
                case 3:
                    contact = updateContact();
                    System.out.println(contact);
                    break;
                case 4:
                    int deleteId = getContactID();
                    phonebook.delete(deleteId);
                    break;
                case 5:
                    phonebook.showAll();
                    break;
                default:
                    System.out.println("INVALID");
                    showOptions();
                    break;
            }

            System.out.println("If you like to exit push enter, otherwise write [No]");
            scan = new Scanner(System.in);

            if (scan.nextLine().isEmpty()) {
                exit = true;
            }
        }
    }

    private void showOptions() {
        System.out.println("MENU: write number and push enter");
        System.out.println("[1] Create");
        System.out.println("[2] Show");
        System.out.println("[3] Edit");
        System.out.println("[4] Delete");
        System.out.println("[5] Show all");
    }

    private Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter Contact Name and push enter: ");
        String name = sc.nextLine();
        System.out.println("Please, enter Contact PhoneNumber and push enter: ");
        String phoneNumber = sc.nextLine();
        System.out.println("If You want to add Email address enter it, otherwise push enter: ");
        String emailAddress = sc.nextLine();

        if (emailAddress == null || emailAddress.length() == 0) {
            return new Contact(name, phoneNumber);
        }
        return new Contact(name, phoneNumber, emailAddress);
    }

    private int getContactID() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter contact ID");
        return sc.nextInt();
    }

    private Contact updateContact() {
        int id = getContactID();
        Contact contact = phonebook.find(id);
        System.out.println("Enter 1, if You want to update name!");
        System.out.println("Enter 2, if You want to update phone number!");
        System.out.println("Enter 3, if You want to update Email address!");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1:
                String newName = scan.nextLine();
                contact.setName(newName);
                contact = phonebook.update(contact);
                break;
            case 2:
                String newPhoneNumber = scan.nextLine();
                contact.setPhoneNumber(newPhoneNumber);
                contact = phonebook.update(contact);
                break;
            case 3:
                String newEmailAddress = scan.nextLine();
                contact.setEmailAddress(newEmailAddress);
                contact = phonebook.update(contact);
                break;
        }
        return contact;
    }
}