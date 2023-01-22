package com.Shopping.onlineshop.controller;


import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.Services.GenericService;
import com.Shopping.onlineshop.entities.GenericEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class GenericController<T extends GenericEntity<T>> {
    private GenericService<T> service;

    public GenericController(GenericRepository<T> repository) {
        this.service = new GenericService<T>(repository) {};
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getOne(@PathVariable Long id){
        return ResponseEntity.ok(service.get(id));
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
    public ResponseEntity<String> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.ok("Ok");
    }

}
