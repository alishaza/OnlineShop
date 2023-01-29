package com.Shopping.onlineshop.controller.Generics;


import com.Shopping.onlineshop.Repositories.Generics.GenericRepository;
import com.Shopping.onlineshop.Services.Generics.GenericService;
import com.Shopping.onlineshop.entities.Generics.GenericEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

public class GenericController<T extends GenericEntity<T>> {
    private GenericService<T> service;

    public GenericController(GenericRepository<T> repository) {
        this.service = new GenericService<T>(repository) {};
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getOne(@PathVariable Long id){
        return  ResponseEntity.ok(service.get(id));
    }

    @GetMapping("")
    public ResponseEntity<List<T>> getAll(){
        return ResponseEntity.ok(service.getAll()) ;
    }
    @PutMapping("")
    public ResponseEntity<T> update(@RequestBody T updated){
        return ResponseEntity.ok(service.update(updated));
    }


    @PostMapping("")
    public ResponseEntity<T> create(@RequestBody T created){
        return ResponseEntity.ok(service.add(created));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
