package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISongRepository extends JpaRepository<Song, Long> {
}
