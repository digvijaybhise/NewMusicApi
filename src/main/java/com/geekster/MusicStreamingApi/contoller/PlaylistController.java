package com.geekster.MusicStreamingApi.contoller;

import com.geekster.MusicStreamingApi.model.Playlist;
import com.geekster.MusicStreamingApi.service.PlaylistService;
import com.geekster.MusicStreamingApi.service.UserAuthenticationService;
import com.geekster.MusicStreamingApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("playlist")
public class PlaylistController {

    @Autowired
    PlaylistService playlistService;

    @Autowired
    UserService userService;

    @Autowired
    UserAuthenticationService userAuthenticationService;

    @PostMapping("add/{userEmail}/{token}")
    public String addPlayList(@PathVariable String userEmail, @PathVariable String token, @RequestBody Playlist playlist){
        if(!userAuthenticationService.authenticate(userEmail, token)){
            return "You haven't signed in yet.... Ypu cannot perform the operation";
        }
        return playlistService.addPlayList(userEmail, playlist);
    }

    @GetMapping("{userEmail}/{token}")
    public Playlist playlistList(@PathVariable String userEmail, @PathVariable String token){
        if(!userAuthenticationService.authenticate(userEmail, token)){
            return null;
        }
        return userService.getPlaylists(userEmail);
    }

    @DeleteMapping("/{playlistId}/{userEmail}/{token}")
    public String deleteSongFromPlaylist(@PathVariable Long playlistId, @PathVariable String userEmail, @PathVariable String token){
        if(!userAuthenticationService.authenticate(userEmail, token)){
            return "You haven't signed in yet.... Ypu cannot perform the operation";
        }
        return userService.deletePlaylist(userEmail, playlistId);
    }
}
