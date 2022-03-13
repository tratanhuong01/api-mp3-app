package com.apimp3app.Mp3App.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service

public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public List<Music> getAllMusic(String search) {
        return musicRepository.getMusicAll(search);
    }

    public List<Music> getMusicLimit(String search,Integer offset,
                                     Integer limit) {
        return musicRepository.getMusicLimit(search, offset, limit);
    }

    public Music addMusic(Music music) {
        music.setTimeCreated(new Timestamp(new Date().getTime()));
        return musicRepository.save(music);
    }

    public Music updateMusic(Music music) {
        return musicRepository.save(music);
    }

    public void deleteMusic(Music music) {
        musicRepository.delete(music);
    }

}
