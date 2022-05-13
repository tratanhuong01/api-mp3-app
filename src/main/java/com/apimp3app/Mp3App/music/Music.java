package com.apimp3app.Mp3App.music;

import com.apimp3app.Mp3App.album.Album;
import com.apimp3app.Mp3App.artist.Artist;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "music")
@Getter
@Setter

public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String name;

    @Column
    String album;

    @JoinColumn(name = "id_artist")
    @ManyToOne
    Artist artistMusic;

    @JoinColumn(name = "id_album")
    @ManyToOne
    Album albumMusic;
    
    @Column
    String image;

    @Column
    String audio;

    @Column
    Timestamp timeCreated;

}
