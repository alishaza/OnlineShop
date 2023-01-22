package com.Shopping.onlineshop.Services;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.GenericEntity;


public abstract class GenericService<T extends GenericEntity<T>> {
    private  GenericRepository<T> repository;

    public GenericService(GenericRepository<T> repository) {
        this.repository = repository;
    }

    public T get(Long id){
        return   repository.findById(id).get();

    }

    public T update( T model){
        T domain = get(model.getId());
        domain.update(model);
        return repository.save(domain);
    }

    public T add(T model){
        return repository.save(model);
    }
    public void delete(Long id){
        get(id);
        repository.deleteById(id);
    }

}
