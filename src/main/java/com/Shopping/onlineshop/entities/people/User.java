package com.Shopping.onlineshop.entities.people;

import com.Shopping.onlineshop.entities.GenericEntity;
import com.Shopping.onlineshop.entities.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements GenericEntity<User> {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;

    @OneToOne(
            mappedBy = "user",
            cascade = CascadeType.ALL
    )
    private Customer customer;
    private UserRole userRole;

    private boolean enable;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void update(User model) {
        setEnable(model.isEnable());
        setFirstName(model.getFirstName());
        setLastName(model.getLastName());
        setPassword(model.getPassword());
        setUserRole(model.getUserRole());
        setUsername(model.getUsername());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}

