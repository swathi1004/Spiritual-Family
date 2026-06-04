// repository/gallery/PhotoRepository.java

package com.spiritualfamily.backend.repository.gallery;

import com.spiritualfamily.backend.entity.gallery.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository
        extends JpaRepository<Photo, Long> {
}