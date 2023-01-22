package com.Shopping.onlineshop.Repositories;

import com.Shopping.onlineshop.entities.GenericEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity<T>> extends CrudRepository<T,Long> {

}
