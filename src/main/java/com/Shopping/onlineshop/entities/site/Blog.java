package com.Shopping.onlineshop.entities.site;

import com.Shopping.onlineshop.entities.Generics.GenericEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Blog implements GenericEntity<Blog> {
    @Id
    @GeneratedValue
    private long id;


    private String title;
    private String subtitle;
    private String description;
    private String image;
    private long visitcount;
    private Date publishedDate;

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    @Override
    public void update(Blog model) {
        setSubtitle(model.getSubtitle());
        setTitle(model.getTitle());
        setDescription(model.getDescription());
        setImage(model.getImage());
        setPublishedDate(model.getPublishedDate());
        setVisitcount(model.getVisitcount());
        setEnable(model.isEnable());

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

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getVisitcount() {
        return visitcount;
    }

    public void setVisitcount(long visitcount) {
        this.visitcount = visitcount;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
}
