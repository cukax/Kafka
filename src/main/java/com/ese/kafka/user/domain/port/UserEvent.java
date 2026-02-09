package com.ese.kafka.user.domain.port;

import com.ese.kafka.user.domain.event.UserDeactivatedDomainEvent;
import com.ese.kafka.user.domain.event.UserVerificationRequestedDomainEvent;

public interface UserEvent {

    void sendUserDeactivatedDomainEvent(UserDeactivatedDomainEvent event);

    void sendUserVerificationRequestedDomainEvent(UserVerificationRequestedDomainEvent event);

}
