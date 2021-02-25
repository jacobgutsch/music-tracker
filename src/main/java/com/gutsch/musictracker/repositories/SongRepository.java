package com.gutsch.musictracker.repositories;

import com.gutsch.musictracker.entities.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Integer> {
}
