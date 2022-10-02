package project_phone_book;

import java.util.HashMap;
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

            if (scan.next().isEmpty()) {
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
        String name = sc.next();
        System.out.println("Please, enter Contact MobilePhoneNumber and push enter: ");
        int phoneNumber = sc.nextInt();

        HashMap<PhoneNumberType, Integer> map = new HashMap<>();
        map.put(PhoneNumberType.MOBILE, phoneNumber);

        System.out.println("If you wont add another number Enter yes");
        String answer = sc.next();

        if (answer.equals("yes")) {
            System.out.println("What number your choice?");
            System.out.println("1: WorkNumber \n2: HomeNumber \n3: SchoolNumber");

            int selection = sc.nextInt();
            if (selection == 1) {
                System.out.println("Enter your work number:");
            } else if (selection == 2) {
                System.out.println("Enter your home number:");
            } else if (selection == 3) {
                System.out.println("Enter your school number:");
            }

            phoneNumber = sc.nextInt();
            map.put(numberTypeSelection(selection), phoneNumber);
        }

        System.out.println("If You want to add Email address enter it, otherwise push enter: ");
        String emailAddress = sc.next();


        if (emailAddress == null || emailAddress.length() == 0) {
            return new Contact(name, map);
        }
        return new Contact(name, map, emailAddress);
    }

    private static PhoneNumberType numberTypeSelection(int selection) {
        switch (selection) {
            case 1:
                return PhoneNumberType.WORK;
            case 2:
                return PhoneNumberType.HOME;
            case 3:
                return PhoneNumberType.SCHOOL;
            default:
                System.out.println("Invalid input!!!");
        }
        return null;
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
                System.out.println("Enter new name: ");
                scan = new Scanner(System.in);
                String newName = scan.next();
                contact.setName(newName);
                contact = phonebook.update(contact);
                break;
            case 2:
                System.out.println("Please, enter Contact MobilePhoneNumber and push enter: ");
                int phoneNumber = scan.nextInt();

                HashMap<PhoneNumberType, Integer> map = new HashMap<>();
                map.put(PhoneNumberType.MOBILE, phoneNumber);

                System.out.println("If you wont add another number Enter yes");
                String answer = scan.next();

                if (answer.equals("yes")) {
                    System.out.println("What number your choice?");
                    System.out.println("1: WorkNumber \n2: HomeNumber \n3: SchoolNumber");

                    int selection = scan.nextInt();
                    if (selection == 1) {
                        System.out.println("Enter your work number:");
                    } else if (selection == 2) {
                        System.out.println("Enter your home number:");
                    } else if (selection == 3) {
                        System.out.println("Enter your school number:");
                    }

                    phoneNumber = scan.nextInt();
                    map.put(numberTypeSelection(selection), phoneNumber);
                }
                contact.setPhoneNumber(map);
                break;
//                System.out.println("Enter new phone number: ");
//                scan = new Scanner(System.in);
//                String newPhoneNumber = scan.nextLine();
//                contact.setPhoneNumber(newPhoneNumber);
//                contact = phonebook.update(contact);
//                break;

            case 3:
                System.out.println("Enter new email address: ");
                scan = new Scanner(System.in);
                String newEmailAddress = scan.next();
                contact.setEmailAddress(newEmailAddress);
                contact = phonebook.update(contact);
                break;
        }
        return contact;
    }
}