package homeworkBDG_Class7;

public class Employee {
    public int id;
    public String name;
    public String department;
    public int age;
    public String gender;

    public Employee(int id, String name, String department, int age, String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void printEmployee() {
        System.out.println(id + " " + name + " " + age + " " + department + " " + gender);
    }

}
