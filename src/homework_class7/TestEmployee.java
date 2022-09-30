package homework_class7;

public class TestEmployee {
    public static void main(String[] args) {
        Employee person1 = new Employee(1,"Ani", "Procurment", 26, "Female");
        Employee person2 = new Employee(2,"Lilit", "IT", 22, "Female");
        Employee person3 = new Employee(3, "John", "Bakery", 30, "Male");

        person1.printEmployee();
        person2.printEmployee();
        person3.printEmployee();
    }
}
