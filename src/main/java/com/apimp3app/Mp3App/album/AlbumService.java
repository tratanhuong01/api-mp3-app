package com.apimp3app.Mp3App.album;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service

public class AlbumService {

    @Autowired
    AlbumRepository albumRepository;

    public List<Album> getAllAlbum() {
        return albumRepository.findAll();
    }

    public Album addAlbum(Album album) {
        album.setTimeCreated(new Timestamp(new Date().getTime()));
        return albumRepository.save(album);
    }

    public Album updateAlbum(Album album) {
        return albumRepository.save(album);
    }

    public void deleteAlbum(Album album) {
        albumRepository.delete(album);
    }

}
