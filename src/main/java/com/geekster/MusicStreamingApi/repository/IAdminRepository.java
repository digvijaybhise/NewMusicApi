package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends JpaRepository<Admin, Long> {

    public boolean existsByAdminEmail(String adminEmail);

    public Admin findAdminByAdminEmail(String userEmail);
}
