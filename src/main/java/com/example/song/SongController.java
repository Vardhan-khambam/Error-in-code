package com.example.song;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.song.SongService;
import com.example.song.Song;

@RestController
public class SongController {
    SongService songservice = new SongService();

    @GetMapping("/songs")
    public ArrayList<Song> getsongs() {
        return songservice.getsongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongbyId(@PathVariable("songId") int songId) {
        return songservice.getSongbyId(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songservice.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId")int songId, @RequestBody Song song){
        return songservice.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable int songId){
        songservice.deleteSong(songId);
    }

}