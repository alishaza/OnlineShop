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
public class Size  implements GenericEntity<Size> {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void update(Size model) {
        setTitle(model.getTitle());
        setDescription(model.getTitle());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
