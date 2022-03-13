package com.apimp3app.Mp3App.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/musics")
@CrossOrigin("*")

public class MusicController {

    @Autowired
    MusicService musicService;

    @GetMapping("/list")
    public List<Music> getAllMusic(@RequestParam(required = false) String search) {
        return musicService.getAllMusic(search);
    }

    @GetMapping("/limit")
    public List<Music> getMusicLimit(@RequestParam String search, @RequestParam Integer offset,
                                     @RequestParam Integer limit) {
        return musicService.getMusicLimit(search, offset, limit);
    }

    @PostMapping("")
    public Music addMusic(@RequestBody Music music) {
        return musicService.addMusic(music);
    }

    @PutMapping("")
    public Music updateMusic(@RequestBody Music music) {
        return musicService.updateMusic(music);
    }

    @DeleteMapping("")
    public void deleteMusic(@RequestBody Music music) {
        musicService.deleteMusic(music);
    }

}
