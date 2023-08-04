package com.pp.test.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class loginRequest {

    private String email;

    private String password;
}
