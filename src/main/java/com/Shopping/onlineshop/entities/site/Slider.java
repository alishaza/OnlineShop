package com.Shopping.onlineshop.entities.site;

import com.Shopping.onlineshop.entities.GenericEntity;
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
public class Slider implements GenericEntity<Slider> {
    @Id
    @GeneratedValue
    private long id;

    private String title;
    private String link;
    private String image;
    private String description;
    private Integer itemOrder;
    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void update(Slider model) {
        setEnable(model.isEnable());
        setTitle(model.getTitle());
        setDescription(model.getDescription());
        setImage(model.getImage());
        setLink(model.getLink());
        setOrder(model.getOrder());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOrder() {
        return itemOrder;
    }

    public void setOrder(Integer order) {
        this.itemOrder = order;
    }
}
