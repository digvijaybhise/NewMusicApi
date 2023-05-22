package com.geekster.MusicStreamingApi.service;

import com.geekster.MusicStreamingApi.model.Playlist;
import com.geekster.MusicStreamingApi.model.Song;
import com.geekster.MusicStreamingApi.model.User;
import com.geekster.MusicStreamingApi.repository.IPlaylistRepository;
import com.geekster.MusicStreamingApi.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    IPlaylistRepository playlistRepository;

    @Autowired
    IUserRepository userRepository;

    @Autowired
    SongService songService;

    public String addPlayList(String userEmail, Playlist playlist) {
        User user = userRepository.findByUserEmail(userEmail);

        user.setPlaylist(playlist);
        playlistRepository.save(playlist);
        return "Playlist added successfully";
    }

    public void deleteById(Long playlistId) {
        playlistRepository.deleteById(playlistId);
    }
}
