package country;

public class TestCountry {
    public static void main(String[] args) {
        Country armenia = new Country(300000, "Yerevan", "Armenia");

        System.out.println(armenia);

        armenia.addPerson();
        Country.worldPeopleCount++;
        armenia.printCountryPeopleCount();
        armenia.printWorldPeopleCount();

        Country russia = new Country(4000, "Moscow", "Russian Federation");

        System.out.println(russia);
        russia.addPerson(5);
        Country.worldPeopleCount += 5;
        russia.printCountryPeopleCount();
        russia.printWorldPeopleCount();
    }
}
