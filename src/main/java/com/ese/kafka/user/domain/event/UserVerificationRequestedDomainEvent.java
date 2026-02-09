package com.ese.kafka.user.domain.event;

import com.ese.kafka.user.domain.entity.User;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class UserVerificationRequestedDomainEvent {

    private Long id;

    private String email;

    private Long timestamp;

    public static UserVerificationRequestedDomainEvent of(User user) {
        return UserVerificationRequestedDomainEvent.builder()
                .id(user.getId())
                .email(user.getEmail())
                .timestamp(Instant.now().toEpochMilli())
                .build();
    }

}
