package com.Shopping.onlineshop.entities.orders;

import com.Shopping.onlineshop.entities.Generics.GenericEntity;
import com.Shopping.onlineshop.entities.people.Customer;
import com.Shopping.onlineshop.entities.products.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class OrderItems implements GenericEntity<OrderItems> {
    @Id
    @GeneratedValue
    private long id;



    @OneToOne(optional = false)
    private Customer customer;

    @OneToOne(optional = false)
    private Product product;

    private Integer count;

    private long price;

    @Override
    public void update(OrderItems model) {
        setCount(model.getCount());
        setPrice(model.getPrice());

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
