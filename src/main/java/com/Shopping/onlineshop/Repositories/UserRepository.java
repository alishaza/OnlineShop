package com.Shopping.onlineshop.Repositories;

import com.Shopping.onlineshop.entities.people.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    @Query("from User where enable = true and username = concat('%' , :username ,'%') and password = concat('%' , :password ,'%')")
    User findFirstByEnableIsTrueAndUsernameAnAndPassword(String username , String password);


}
