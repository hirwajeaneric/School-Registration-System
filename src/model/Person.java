package model;

import java.time.LocalDate;

/**
 *
 * @author hirwa
 */
public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String phoneNumber;
    private String emailAddress;
    private String registrantType;
    private Byte picture;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dob, String gender, String phoneNumber, String emailAddress, String registrantType, Byte picture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.registrantType = registrantType;
        this.picture = picture;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getRegistrantType() {
        return registrantType;
    }

    public void setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
    }

    public Byte getPicture() {
        return picture;
    }

    public void setPicture(Byte picture) {
        this.picture = picture;
    }
    
    
}
