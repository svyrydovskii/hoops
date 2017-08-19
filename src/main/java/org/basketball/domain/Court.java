package org.basketball.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Public on 23.09.2016.
 */
@Entity
public class Court {
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    @Id
    private UUID id;
    private String name;
    @Lob
    private String description;

    @ManyToMany
    private List<Picture> pictures;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int hoops;
    @Embedded
    private Location location;

    @OneToMany(mappedBy = "court")
    private List<Game> games = new ArrayList<>();

    @OneToMany(mappedBy = "court")
    private List<Comment> comments;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getHoops() {
        return hoops;
    }

    public void setHoops(int hoops) {
        this.hoops = hoops;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Comment> getComments() {
        return comments;
    }

    //    @ElementCollection
//    private List<String> photos;

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Court() {
    }
}
