package project_phone_book;

import java.util.Objects;

public class Contact {
    private static int counter = 1;

    private String name;
    private String phoneNumber;
    private String emailAddress;
    private int contactID;

    public Contact(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.contactID = counter;
        counter++;
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contactID = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        if (Objects.isNull(emailAddress)) {
            return "Email address not entered";
        }
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getContactID() {
        return contactID;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  Number: %s  Email: %s", getName(), getPhoneNumber(), getEmailAddress());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (contactID != contact.contactID) return false;
        if (name != null ? !name.equals(contact.name) : contact.name != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(contact.phoneNumber) : contact.phoneNumber != null) return false;
        return emailAddress != null ? emailAddress.equals(contact.emailAddress) : contact.emailAddress == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + contactID;
        return result;
    }
}
