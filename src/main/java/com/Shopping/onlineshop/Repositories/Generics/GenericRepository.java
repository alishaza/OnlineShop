package com.Shopping.onlineshop.Repositories.Generics;

import com.Shopping.onlineshop.entities.Generics.GenericEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity<T>> extends CrudRepository<T,Long> {
    @Override
    List<T> findAll();
}
