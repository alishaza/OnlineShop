package com.Shopping.onlineshop.Repositories.orders;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.orders.Invoice;
import com.Shopping.onlineshop.entities.site.Nav;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends GenericRepository<Invoice> {
    @Query("from Invoice where customer.id = :id ")
    List<Invoice> findAllByCustomer(long id);


}
