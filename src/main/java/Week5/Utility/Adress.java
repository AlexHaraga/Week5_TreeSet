package Week5.Utility;

public class Adress {
    private String streets;
    private String city;
    private String country;

    public Adress(String streetș, String city, String country) {
        this.streets = streetș;
        this.city = city;
        this.country = country;
    }

    public String getStreets() {
        return streets;
    }

    public void setStreets(String streets) {
        this.streets = streets;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
