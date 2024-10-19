package com.uade.soundseekers.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface EventDAO {
    Optional<Event> findById(Long id);
    List<Event> findAll();
    void save(Event event);
    void update(Event event);
    void deleteById(Long id);
    List<Event> findByAdvancedFilters(String name, List<musicGenre> genres, LocalDateTime startDate, LocalDateTime endDate, Double minPrice, Double maxPrice);
    List<Event> findByProximity(Double lat, Double lng, Double radius);
}