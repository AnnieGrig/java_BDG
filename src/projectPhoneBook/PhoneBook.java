package projectPhoneBook;

public interface PhoneBook {

    Contact find(int id);

    Contact update(Contact contact);

    void add(Contact contact);

    void delete(int id);

    void showAll();


}
