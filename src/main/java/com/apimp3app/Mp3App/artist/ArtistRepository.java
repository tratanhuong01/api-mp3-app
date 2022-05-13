package com.apimp3app.Mp3App.artist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ArtistRepository extends JpaRepository<Artist,Long> {
}
