package com.apimp3app.Mp3App.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/albums")

public class AlbumController {

    @Autowired
    AlbumService albumService;

    @GetMapping("")
    public List<Album> getAllAlbum() {
        return albumService.getAllAlbum();
    }

    @PostMapping("")
    public Album addAlbum(@RequestBody Album album) {
        return albumService.addAlbum(album);
    }

    @PutMapping("")
    public Album updateAlbum(@RequestBody Album album) {
        return albumService.updateAlbum(album);
    }

    @DeleteMapping("")
    public void deleteAlbum(@RequestBody Album album) {
        albumService.deleteAlbum(album);
    }

}
