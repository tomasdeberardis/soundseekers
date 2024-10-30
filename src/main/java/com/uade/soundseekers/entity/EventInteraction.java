package com.uade.soundseekers.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class EventInteraction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    private Boolean liked;
    private Boolean assisted;

    private LocalDateTime interactionDate;

    public EventInteraction(User user, Event event, boolean b, boolean b1, LocalDateTime now) {
        this.user = user;
        this.event = event;
        this.liked = b;
        this.assisted = b1;
        this.interactionDate = now;
    }

    // Constructors, getters, setters
}