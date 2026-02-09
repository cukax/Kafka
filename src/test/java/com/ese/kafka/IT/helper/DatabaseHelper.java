package com.ese.kafka.IT.helper;

import com.ese.kafka.user.domain.entity.User;
import com.ese.kafka.user.domain.port.UserRepository;
import org.awaitility.Durations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Predicate;

import static org.awaitility.Awaitility.await;

@Service
public class DatabaseHelper {

    @Autowired
    private UserRepository userRepository;

    public User findByIdAndCondition(Long id, Predicate<User> predicate) {

        await()
                .atLeast(Durations.ONE_HUNDRED_MILLISECONDS)
                .atMost(Durations.TEN_SECONDS)
                .with()
                .pollInterval(Durations.TWO_HUNDRED_MILLISECONDS)
                .ignoreException(Exception.class)
                .until(() -> {
                            Optional<User> user = userRepository.findById(id);
                            return user.isPresent() && predicate.test(user.get());
                        }
                );

        return userRepository.findById(id).orElseThrow();

    }

}
