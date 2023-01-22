package com.Shopping.onlineshop.Repositories.people;

import com.Shopping.onlineshop.Repositories.GenericRepository;
import com.Shopping.onlineshop.entities.people.User;
import com.Shopping.onlineshop.entities.site.Nav;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends GenericRepository<User> {

    @Query("from User where enable = true and username = concat('%' , :username ,'%') and password = concat('%' , :password ,'%')")
    User findFirstByEnableIsTrueAndUsernameAnAndPassword(String username , String password);


}
