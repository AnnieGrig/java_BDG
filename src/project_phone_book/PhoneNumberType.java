package project_phone_book;

public enum PhoneNumberType {
    MOBILE("Mobile"),
    WORK("Work"),
    HOME("Home"),
    SCHOOL("School");

    private String name;

    PhoneNumberType(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
