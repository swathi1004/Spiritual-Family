// ======================================================
// entity/devotion/BibleVerse.java
// ======================================================

package com.spiritualfamily.backend.entity.devotion;

import java.time.LocalDate;

import com.spiritualfamily.backend.entity.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bible_verses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BibleVerse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String verseReference;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String verseText;

    private String language;

    @Column(unique = true)
    private LocalDate postedDate;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;
}