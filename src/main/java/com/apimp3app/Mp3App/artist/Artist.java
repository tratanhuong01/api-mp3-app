package com.apimp3app.Mp3App.artist;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "artist")
@Getter
@Setter

public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameArtist;

    @Column
    private String imageArtist;

    @Column
    private Timestamp timeCreated;

}
