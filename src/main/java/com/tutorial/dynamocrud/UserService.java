package com.tutorial.dynamocrud;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

  @Autowired
  UserRepository userRepository;

  public Iterable<User> listOfUsers(){
    return userRepository.findAll();
  }

  public User findUserById(String id){
    return userRepository.findById(id).get();
  }

  public User save(UserDTO userDTO){
    User user = new User();
    user.setFirstName(userDTO.getFirstname());
    user.setLastName(userDTO.getLastname());
    return userRepository.save(user);
  }

  public User update(String id, UserDTO userDTO){
    User user = userRepository.findById(id).get();
    user.setFirstName(userDTO.getFirstname());
    user.setLastName(userDTO.getLastname());
    return userRepository.save(user);
  }

  public void delete(String id){
    userRepository.deleteById(id);
  }

  public boolean existsById(String id){
    return userRepository.existsById(id);
  }
}
