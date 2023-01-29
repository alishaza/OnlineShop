package com.Shopping.onlineshop.Repositories.orders;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.entities.orders.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends GenericRepository<Invoice> {
    @Query("from Invoice where customer.id = :id ")
    List<Invoice> findAllByCustomer(long id);


}
