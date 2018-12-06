package com.developer.SpringMySql.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUsersRepo extends CrudRepository<AppUsers , Integer> {

}
