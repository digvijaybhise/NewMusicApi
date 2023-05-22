package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.Admin;
import com.geekster.MusicStreamingApi.model.AdminAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminAuthenticationRepository extends JpaRepository<AdminAuthentication, Long> {

    AdminAuthentication findByToken(String token);
}
