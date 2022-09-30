package project_phone_book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PhoneBookImpl implements PhoneBook {

    List<Contact> contacts = new ArrayList<>();

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public Contact find(int id) {
        for (Contact item : contacts) {
            if (item.getContactID() == id) {
                return item;
            }
        }
        return null;
    }

    @Override
    public Contact update(Contact contact) {
        for (Contact item : contacts) {
            if (item.getContactID() == contact.getContactID()) {
                if (!Objects.equals(item.getName(), contact.getName())) {
                    item.setName(contact.getName());
                }

                if (!Objects.equals(item.getPhoneNumber(), contact.getPhoneNumber())) {
                    item.setPhoneNumber(contact.getPhoneNumber());
                }

                if (!Objects.equals(item.getEmailAddress(), contact.getEmailAddress())) {
                    item.setEmailAddress(contact.getEmailAddress());
                }
            }
        }
        return contact;
    }

    @Override
    public void delete(int id) {
        boolean isDeleted = false;

        for (Contact item : this.contacts) {
            if (item.getContactID() == id) {
                this.contacts.remove(item);
                isDeleted = true;
                break;
            }
        }
        if (isDeleted) {
            System.out.println("Contact is deleted!");
        } else {
            System.out.println("Contact does not exists");
        }
    }

    @Override
    public void showAll() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty!");
        } else {
            for (Contact item : contacts) {
                System.out.println(item);
            }
        }
    }
}
