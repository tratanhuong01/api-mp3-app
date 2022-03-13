package com.apimp3app.Mp3App.music;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
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

    @Column
    String artist;

    @Column
    String image;

    @Column
    String audio;

    @Column
    Timestamp timeCreated;

}
