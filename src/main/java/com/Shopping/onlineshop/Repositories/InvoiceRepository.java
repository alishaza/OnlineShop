package com.Shopping.onlineshop.Repositories;

import com.Shopping.onlineshop.entities.orders.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    @Query("from Invoice where customer.id = :id ")
    List<Invoice> findAllByCustomer(long id);


}
