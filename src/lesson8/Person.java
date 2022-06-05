package lesson8;

public class Person {
    public String name;
    public double balance;
    public Company workCompany;


    public void sendMoney (Person otherPerson, double amount) {
        this.balance -= amount;
        otherPerson.balance += amount;
    }
}


