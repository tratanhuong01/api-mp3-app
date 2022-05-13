package com.apimp3app.Mp3App.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/artists")

public class ArtistController {

    @Autowired
    ArtistService artistService;

    @GetMapping("")
    public List<Artist> getAllArtist() {
        return artistService.getAllArtist();
    }

    @PostMapping("")
    public Artist addArtist(@RequestBody Artist artist) {
        return artistService.addArtist(artist);
    }

    @PutMapping("")
    public Artist updateArtist(@RequestBody Artist artist) {
        return artistService.updateArtist(artist);
    }

    @DeleteMapping("")
    public void deleteArtist(@RequestBody Artist artist) {
        artistService.deleteArtist(artist);
    }


}
