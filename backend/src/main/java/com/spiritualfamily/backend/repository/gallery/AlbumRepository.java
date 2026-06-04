// repository/gallery/AlbumRepository.java

package com.spiritualfamily.backend.repository.gallery;

import com.spiritualfamily.backend.entity.gallery.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository
        extends JpaRepository<Album, Long> {
}