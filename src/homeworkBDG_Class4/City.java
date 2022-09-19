package homeworkBDG_Class4;

public class City {
    private long population;
    private String name;

    public City(String name, long population ) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String toString() {
        return "City{" +
                "populatioan=" + population +
                ", name='" + name + '\'' +
                '}';
    }
}
