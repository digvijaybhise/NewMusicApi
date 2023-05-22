package com.geekster.MusicStreamingApi.service;

import com.geekster.MusicStreamingApi.model.User;
import com.geekster.MusicStreamingApi.model.UserAuthentication;
import com.geekster.MusicStreamingApi.repository.IUserAuthenticationRepository;
import com.geekster.MusicStreamingApi.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthenticationService {

    @Autowired
    IUserRepository userRepository;

    @Autowired
    IUserAuthenticationRepository authenticationRepository;

    public boolean authenticate(String userEmail, String token) {
        User user = userRepository.findByUserEmail(userEmail);
        UserAuthentication authToken = authenticationRepository.findByUser(user);
        return token.equals(authToken.getToken());
    }

}
