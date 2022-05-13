package com.apimp3app.Mp3App.album;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AlbumRepository extends JpaRepository<Album,Long> {
}
