package com.Shopping.onlineshop.Repositories;

import com.Shopping.onlineshop.entities.products.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product,Long> {

    @Query("from Product where category.id = :category_id")
    List<Product> findAllByCategory(long category_id);

    @Query("from Product where enable = true  and (title like concat('%' , :text,'%') and description like concat('%',:text,'%') )")
    List<Product> findAllByEnableIsTrueAndTitleContainsOrDescriptionContains(String text);
}
