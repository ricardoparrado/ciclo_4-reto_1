package com.usa.ciclo4.repository.crud;

import com.usa.ciclo4.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

public interface UserCrudRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);

}
