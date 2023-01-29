package com.Shopping.onlineshop.entities.people;

import com.Shopping.onlineshop.entities.Generics.GenericEntity;
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
public class Customer implements GenericEntity<Customer> {

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

    @Override
    public void update(Customer model) {
        setAddress(model.getAddress());
        setFirstname(model.getFirstname());
        setEmail(model.getEmail());
        setLastname(model.getLastname());
        setPostalcode(model.getPostalcode());
        setTelegram_id(model.getTelegram_id());
        setMobile(model.getMobile());
    }
}
