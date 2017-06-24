package org.basketball.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Created by Public on 23.09.2016.
 */
@Entity
public class Game {

    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    @Id
    private UUID id;
    private LocalDateTime date;
    private String name;
    private int hoops;
    @ManyToOne
    @JoinColumn(name = "court_id")
    private Court court;

    @ManyToOne
    private Player starter;
    @ManyToMany
    private List<Player> players;
    @ManyToMany
    private List<Comment> comments;
    @ManyToMany
    private List<Badge> badges;
    @ManyToMany
    private List<Picture> pictures;

    public Game() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getHoops() {
        return hoops;
    }

    public void setHoops(int hoops) {
        this.hoops = hoops;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public Player getStarter() {
        return starter;
    }

    public void setStarter(Player starter) {
        this.starter = starter;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }
}
