package com.Shopping.onlineshop.Repositories.site;

import com.Shopping.onlineshop.entities.site.Nav;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavRepository extends CrudRepository<Nav,Long> {

}
