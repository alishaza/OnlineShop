package com.Shopping.onlineshop.people;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private long id ;
    private String firstname;
    private String lastname;
    private String mobile;
    @Nullable
    private String telegram_id;
    private String address;
    private String postalcode;
    private String email;
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
