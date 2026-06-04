// ======================================================
// repository/event/EventRsvpRepository.java
// ======================================================

package com.spiritualfamily.backend.repository.event;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spiritualfamily.backend.entity.event.EventRsvp;

public interface EventRsvpRepository
        extends JpaRepository<EventRsvp, Long> {
}