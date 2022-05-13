package com.apimp3app.Mp3App.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service

public class ArtistService {

    @Autowired
    ArtistRepository artistRepository;

    public List<Artist> getAllArtist() {
        return artistRepository.findAll();
    }

    public Artist addArtist(Artist artist) {
        artist.setTimeCreated(new Timestamp(new Date().getTime()));
        return artistRepository.save(artist);
    }

    public Artist updateArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public void deleteArtist(Artist artist) {
        artistRepository.delete(artist);
    }

}
