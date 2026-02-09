package com.ese.kafka.user.application.deleted;

import com.ese.kafka.common.application.Command;
import com.ese.kafka.common.application.VoidResponse;
import lombok.Data;

import java.time.Instant;

@Data
public class UserDeletedCommand implements Command<VoidResponse> {

    private Long id;
    private Instant timestamp;

}
