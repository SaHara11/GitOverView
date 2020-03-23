package com.gmail.gara;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                "id='" + super.getId() + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
