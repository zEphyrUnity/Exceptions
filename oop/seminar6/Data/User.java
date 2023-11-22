package oop.seminar6.Data;

public abstract class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private String dateB;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateB='" + dateB + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateB() {
        return dateB;
    }

    public void setDateB(String dateB) {
        this.dateB = dateB;
    }

    public User(String firstName, String secondName, String lastName, String dateB) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.dateB = dateB;
    }
}
