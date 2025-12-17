package com.ecommerce.entity;

import java.time.LocalDateTime;

import javax.management.relation.Role;

import org.springframework.security.core.userdetails.UserDetails;
org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Entity
@Table(name = "users")
public class{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @NotBlank(message ="Username is required")
     @Size(min = 3, max = 50, message = "Username must be between 3 and 50 characters")
     @Column(unique = true, nullable = false)
    private String username;


     @Size(message = "Email must be valid")
     @Column(unique = true, nullable = false)
     @NotBlank(message = "Email is required")
     private String email;

    @NotBlank(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters long")
    @Column(nullable = false)
    private String password;

    @NotBlank(message = "First name is required")
    @Column(name = "first_name", nullable = false)
     private String firstName;

     @NotBlank(message = "Last name is required")
     @Column(name = "last_name", nullable = false)
     private String lastName;

     @Column(name = "phone_number")
     private String phoneNumber;

     @Column(name = "created_at")   
     private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime UpdatedAt;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role=Role.USER;

    public User{
       this.createdAt=LocalDateTime.now();
       this.UpdatedAt=LocalDateTime.now();
    }
    public User(String username, string email,String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    


    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public String getUsername() {
        return username;
    }



    public void setUsername(String username) {
        this.username = username;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }



    public void setPassword(String password) {
        this.password = password;
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



    public String getPhoneNumber() {
        return phoneNumber;
    }



    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public LocalDateTime getCreatedAt() {
        return createdAt;
    }



    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }



    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }



    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }



    public Role getRole() {
        return role;
    }



    public void setRole(Role role) {
        this.role = role;
    }



    public enum Role {
        ADMIN,
        USER
    }
    
}
