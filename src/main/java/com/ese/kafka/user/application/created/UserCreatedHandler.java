package com.ese.kafka.user.application.created;

import com.ese.kafka.common.application.CommandHandler;
import com.ese.kafka.common.application.VoidResponse;
import com.ese.kafka.user.domain.entity.User;
import com.ese.kafka.user.domain.event.UserVerificationRequestedDomainEvent;
import com.ese.kafka.user.domain.port.UserEvent;
import com.ese.kafka.user.domain.port.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserCreatedHandler implements CommandHandler<UserCreatedCommand, VoidResponse> {

    private final UserRepository userRepository;

    private final UserEvent userEvent;

    @Override
    public VoidResponse handle(UserCreatedCommand command) {
        log.info("UserCreatedHandler command: {}", command);

        User user = User.builder()
                .id(command.getId())
                .firstname(command.getFirstname())
                .lastname(command.getLastname())
                .email(command.getEmail())
                .role(command.getRole())
                .password(RandomStringUtils.randomAlphanumeric(10))
                .createdAt(command.getTimestamp())
                .updatedAt(null)
                .deletedAt(null)
                .build();

        userRepository.save(user);

        UserVerificationRequestedDomainEvent domainEvent = UserVerificationRequestedDomainEvent.of(user);

        userEvent.sendUserVerificationRequestedDomainEvent(domainEvent);

        return new VoidResponse();
    }

    @Override
    public Class<UserCreatedCommand> getCommandType() {
        return UserCreatedCommand.class;
    }
}
