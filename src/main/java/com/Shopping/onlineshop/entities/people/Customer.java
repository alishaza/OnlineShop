package com.Shopping.onlineshop.entities.people;

import jakarta.annotation.Nullable;
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
public class Customer {

    @Id
    @GeneratedValue
    private long id ;
    private String firstname;
    private String lastname;
    private String mobile;
    @Nullable
    private String telegram_id;
    private String address;
    private String postalcode;
    private String email;
    @OneToOne(
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(
            name="user_id"
    )
    private User user;
}
