package com.Shopping.onlineshop.Services.Generics;

import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.entities.Generics.GenericEntity;

import java.util.List;


public abstract class GenericService<T extends GenericEntity<T>> {
    private  GenericRepository<T> repository;

    public GenericService(GenericRepository<T> repository) {
        this.repository = repository;
    }

    public T get(Long id){
        return   repository.findById(id).get();

    }
    public List<T> getAll(){
        return  repository.findAll();
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
