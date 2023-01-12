package com.Shopping.onlineshop.orders;

import com.Shopping.onlineshop.people.Customer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue
    private long id;

    @OneToOne(
            cascade = CascadeType.ALL,
            optional = false
    )
    private Customer customer;

    private Date invoiceDate;
    private Date payedDate;

    @OneToMany
    @JoinColumn(name = "order_items")
    private List<OrderItems> orderIte;

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

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Date getPayedDate() {
        return payedDate;
    }

    public void setPayedDate(Date payedDate) {
        this.payedDate = payedDate;
    }

    public List<OrderItems> getOrderIte() {
        return orderIte;
    }

    public void setOrderIte(List<OrderItems> orderIte) {
        this.orderIte = orderIte;
    }
}
