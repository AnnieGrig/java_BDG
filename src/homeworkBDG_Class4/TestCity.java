package homeworkBDG_Class4;

public class TestCity {
    public static void main(String[] args) {

        City city1 = new City("Yerevan", 1_100_000);

        City city2 = new City("Moscow", 11_920_000);

        City city3 = new City("New York", 8_380_000);

        City city4 = new City("Paris", 2_161_000);

        System.out.println("The population of " + city1.getName() + " is " + city1.getPopulation());
        System.out.println("The population of " + city2.getName() + " is " + city2.getPopulation());
        System.out.println("The population of " + city3.getName() + " is " + city3.getPopulation());
        System.out.println("The population of " + city4.getName() + " is " + city4.getPopulation());
    }
}
