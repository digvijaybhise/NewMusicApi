package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.User;
import com.geekster.MusicStreamingApi.model.UserAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserAuthenticationRepository extends JpaRepository<UserAuthentication, Long> {

    public UserAuthentication findByUser(User user);
}
