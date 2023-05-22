package com.geekster.MusicStreamingApi.service;

import com.geekster.MusicStreamingApi.model.Admin;
import com.geekster.MusicStreamingApi.model.AdminAuthentication;
import com.geekster.MusicStreamingApi.repository.IAdminAuthenticationRepository;
import com.geekster.MusicStreamingApi.repository.IAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthenticationService {

    @Autowired
    IAdminRepository adminRepository;

    @Autowired
    IAdminAuthenticationRepository authenticationRepository;

    public boolean authenticate(String adminEmail, String token) {
        Admin admin = adminRepository.findAdminByAdminEmail(adminEmail);
        AdminAuthentication authToken = authenticationRepository.findByToken(token);
        boolean authenticate = authToken.getToken().equals(token);
        return authenticate;
    }
}
