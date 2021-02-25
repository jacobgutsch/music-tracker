package com.gutsch.musictracker.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;

@Entity(name = "song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "song_id", nullable = false)
    private int songId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "song_name")
    private String songName;

    @Column(name = "composer_name")
    private String composerName;

    @Column(name = "season")
    private String season;

    @Column(name = "instrument")
    private String instrument;

    @Column(name = "page")
    private int pageNumber;

    @Column(name = "create_timestamp", nullable = false)
    @CreatedDate
    private long createTimestamp;

    @Column(name = "update_timestamp", nullable = false)
    @LastModifiedDate
    private long updateTimestamp;

    @Column(name = "tags")
    private String tags;

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getComposerName() {
        return composerName;
    }

    public void setComposerName(String composerName) {
        this.composerName = composerName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        return new EqualsBuilder().append(songId, song.songId).append(pageNumber, song.pageNumber).append(createTimestamp, song.createTimestamp).append(updateTimestamp, song.updateTimestamp).append(book, song.book).append(songName, song.songName).append(composerName, song.composerName).append(season, song.season).append(instrument, song.instrument).append(tags, song.tags).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(songId).append(book).append(songName).append(composerName).append(season).append(instrument).append(pageNumber).append(createTimestamp).append(updateTimestamp).append(tags).toHashCode();
    }

    @Override
    public String toString() {
        return "Song{" +
                "songId=" + songId +
                ", book=" + book +
                ", songName='" + songName + '\'' +
                ", composerName='" + composerName + '\'' +
                ", season='" + season + '\'' +
                ", instrument='" + instrument + '\'' +
                ", pageNumber=" + pageNumber +
                ", createTimestamp=" + createTimestamp +
                ", updateTimestamp=" + updateTimestamp +
                ", tags='" + tags + '\'' +
                '}';
    }
}
