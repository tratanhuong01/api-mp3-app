package com.apimp3app.Mp3App.album;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "album")
@Getter
@Setter

public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameAlbum;

    @Column
    private String imageAlbum;

    @Column
    private Timestamp timeCreated;

}
