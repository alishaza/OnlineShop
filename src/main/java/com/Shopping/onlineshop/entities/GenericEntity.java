package com.Shopping.onlineshop.entities;

public interface GenericEntity <T>{

    void update(T model);

    long getId();

}
