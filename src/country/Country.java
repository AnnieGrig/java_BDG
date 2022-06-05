package country;

public class Country {
    public static int worldPeopleCount = 7854987;
    private int peopleCount;
    private String capitalCity;
    private String name;

    public Country(int peopleCount, String capitalCity, String name) {
        this.peopleCount = peopleCount;
        this.capitalCity = capitalCity;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public void addPerson() {
        peopleCount++;
    }

    public void addPerson(int personCount) {
        peopleCount += personCount;
    }

    public void printCountryPeopleCount() {
        System.out.println(name + " " + peopleCount);
    }

    public void printWorldPeopleCount() {
        System.out.println("World people count is " + worldPeopleCount);
    }

    public String toString() {
        return "Country{" + "peopleCount=" + peopleCount +
                ", capitalCity='" + capitalCity + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
