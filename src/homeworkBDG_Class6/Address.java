package homeworkBDG_Class6;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private int house;

    public Address(String country, String region, String city,String street, int house) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}

class Bank {
    private String bankName;
    private Address address;
}
