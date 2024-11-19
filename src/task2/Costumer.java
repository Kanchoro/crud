package task2;

import java.time.LocalDate;

public class Costumer {
    private String firstName ;
    private String email ;
    private LocalDate localDate;
    private String phoneNumber;
    private  long id;

    public Costumer(long id,String firstName, String email, LocalDate localDate, String phoneNumber) {
        this.firstName = firstName;
        this.email = email;
        this.localDate = localDate;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", localDate=" + localDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
