package com.geekster.MusicStreamingApi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SignInInput {

    @Email
    private String userEmail;

    @NotNull
    private String userPassword;

}
