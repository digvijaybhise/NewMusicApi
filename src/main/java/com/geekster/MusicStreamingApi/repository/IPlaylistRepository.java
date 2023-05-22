package com.geekster.MusicStreamingApi.repository;

import com.geekster.MusicStreamingApi.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlaylistRepository extends JpaRepository<Playlist, Long> {
}
