package com.geekster.MusicStreamingApi.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Data
public class SignUpAdmin {

    @NotNull
    private String adminFirstName;

    @NotNull
    private String adminLastName;

    @Email(regexp = "[A-Za-z0-9]+@admin\\.com")
    private String adminEmail;

    @NotNull
    private String adminPassword;
}
