package com.otus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
  int id;
  String name;
  String grade;
  String schoolName;
  String city;
}

