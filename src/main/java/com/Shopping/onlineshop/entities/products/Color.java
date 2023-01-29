package com.Shopping.onlineshop.entities.products;

import com.Shopping.onlineshop.entities.Generics.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Color implements GenericEntity<Color> {
    @Id
    @GeneratedValue
    private long id ;
    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public void update(Color model) {
        setName(model.getName());
        setValue(model.getValue());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
