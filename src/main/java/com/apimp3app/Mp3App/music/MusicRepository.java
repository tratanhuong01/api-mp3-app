package com.apimp3app.Mp3App.music;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MusicRepository extends JpaRepository<Music,Long> {

    @Query(value = "SELECT * FROM music WHERE LOWER(name) LIKE (CONCAT('%',LOWER(:search),'%')) OFFSET :offset" +
            " LIMIT :limit ORDER BY time_created DESC",nativeQuery = true)
    List<Music> getMusicLimit(@Param("search") String search,@Param("offset") Integer offset,
                              @Param("limit") Integer limit);

    @Query(value = "SELECT * FROM music WHERE LOWER(name) LIKE (CONCAT('%',LOWER(:search),'%')) " +
            "ORDER BY time_created DESC ",nativeQuery = true)
    List<Music> getMusicAll(@Param("search") String search);


}
