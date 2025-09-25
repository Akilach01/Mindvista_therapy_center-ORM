package com.example.orm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RicieptionDto {

    private String name;
    private String password;
    private int contact;
    private String email;

}
