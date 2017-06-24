package org.basketball.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Created by Public on 23.09.2016.
 */
@Entity
public class Comment {
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    @Id
    private UUID id;
    private LocalDateTime cretedAt;
    @ManyToOne
    private Player author;
    @ManyToOne
    private Game game;
    @ManyToOne
    private Court court;

    public Comment() {
    }
}


