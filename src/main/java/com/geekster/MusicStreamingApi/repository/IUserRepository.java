package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {

    public User findByUserEmail(String userEmail);

    public boolean existsByUserEmail(String userEmail);
}
