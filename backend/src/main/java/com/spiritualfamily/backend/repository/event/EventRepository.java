// ======================================================
// repository/event/EventRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.event;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiritualfamily.backend.entity.event.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findByStartTimeAfter(LocalDateTime time);
}