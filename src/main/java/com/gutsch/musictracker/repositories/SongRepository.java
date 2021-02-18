package com.gutsch.musictracker.repositories;

import com.gutsch.musictracker.entities.Song;
import org.springframework.data.repository.CrudRepository;

public interface SongRepository extends CrudRepository<Song, Integer> {
}
