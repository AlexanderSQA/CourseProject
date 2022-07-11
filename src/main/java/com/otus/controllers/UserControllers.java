package com.otus.controllers;

import com.otus.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user/get", headers = {"content-type=application/json"})
public class UserControllers {

  private final UserDto userDto;

  @Autowired
  public UserControllers(UserDto userDto) {
    this.userDto = userDto;
  }

  @GetMapping(value = "/all")
  public List<UserDto> getAllUsers() {
    List<UserDto> userList = new ArrayList<>();
    userList.add(new UserDto(1, "Thomas Shelby", "78", "St.Patrick's School", "Birmingham"));
    userList.add(new UserDto(2, "John Shelby", "15", "Elementary School", "London"));
    return userList;
  }

  @GetMapping(value = "/{id}")
  public UserDto getSingleUser(@PathVariable("id") int id) {
    return new UserDto(1, "Thomas Shelby", "78", "St.Patrick's School", "Birmingham");
  }

}
