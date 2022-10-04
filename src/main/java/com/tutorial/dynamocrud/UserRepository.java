package com.tutorial.dynamocrud;

import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableScan
@Repository
public interface UserRepository  extends CrudRepository<User, String> {
  boolean existsByFirstname(String firstname);
  List<User> findByLastName(String lastname);
  List<User> findByFirstName(String lastname);
}
