package com.codegym.validate_formdangki.model;

import jakarta.validation.constraints.*;

public class User {

    @NotNull
    @Size(min = 5, max = 45)
    private String firstname;

    @NotNull
    @Size(min = 5, max = 45)
    private String lastname;

    @NotNull
    @Pattern(regexp = "^(\\+\\d{1,3}[- ]?)?\\d{10}$")
    private String phonenumber;

    @NotNull
    @Min(18)
    private Integer age;

    @NotNull
    @Email
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
