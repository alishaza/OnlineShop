package com.Shopping.onlineshop.Services.orders;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.Services.Generics.GenericService;
import com.Shopping.onlineshop.entities.orders.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService extends GenericService<Invoice> {


    public InvoiceService(GenericRepository<Invoice> repository) {
        super(repository);
    }
}
