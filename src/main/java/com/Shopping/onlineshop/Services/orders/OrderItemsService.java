package com.Shopping.onlineshop.Services.orders;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.Services.Generics.GenericService;
import com.Shopping.onlineshop.entities.orders.OrderItems;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class OrderItemsService  extends GenericService<OrderItems> {

    public OrderItemsService(GenericRepository<OrderItems> repository) {
        super(repository);
    }
}
