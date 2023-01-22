package com.Shopping.onlineshop.Repositories.products;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.products.ProductCategory;
import com.Shopping.onlineshop.entities.site.Nav;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductCategoryRepository extends GenericRepository<ProductCategory> {


}
