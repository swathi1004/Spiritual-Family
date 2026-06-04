// repository/notification/NotificationRepository.java

package com.spiritualfamily.backend.repository.notification;

import com.spiritualfamily.backend.entity.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository
        extends JpaRepository<Notification, Long> {
}