package com.projects.javagram;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
  @NotBlank(message = "First name cannot be blank")
  @Size(min = 2, message = "First name is too short")             
  private String firstName;
  
  @NotBlank(message = "Last name cannot be blank")
  @Size(min = 2, message = "Last name is too short")
  private String lastName;
  
  @NotBlank(message = "User name cannot be blank")
  @Size(min = 7, message = "Username too short")
  private String userName;
  
  @Email(message = "Invalid email")
  private String email;
  
  @Past(message = "date of birth must be in the past")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date dateOfBirth;
  

  public User(String firstName, String lastName, String userName, String email, Date dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }
  

  public User() {
  }
  

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getDateOfBirth() {
    return this.dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }
  
  
  
}
