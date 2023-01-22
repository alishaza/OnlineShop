package com.Shopping.onlineshop.entities.products;

import com.Shopping.onlineshop.entities.GenericEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements GenericEntity<Product> {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private long price;
    private String image;
    private long visitCount;


    @ManyToOne
    private ProductCategory category;

    @ManyToMany
    private List<Color> color;

    @ManyToMany
    private List<Feature> features;

    private boolean enable;

    private boolean exists;

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void update(Product model) {
        setVisitCount(model.getVisitCount());
        setDescription(model.getDescription());
        setEnable(model.isEnable());
        setTitle(model.getTitle());
        setPrice(model.getPrice());
        setExists(model.isExists());
        setImage(model.getImage());

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount) {
        this.visitCount = visitCount;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<Color> getColor() {
        return color;
    }

    public void setColor(List<Color> color) {
        this.color = color;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
