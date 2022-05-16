package ke.springboot.graphql.theforceapi.model;

public class Person {
    private String name;
    private String height;
    private String mass;
    private String gender;
    private String homeword;

    public Person() {
    }

    public Person(String name, String height, String mass, String gender, String homeword) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.gender = gender;
        this.homeword = homeword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeword() {
        return homeword;
    }

    public void setHomeword(String homeword) {
        this.homeword = homeword;
    }
}
