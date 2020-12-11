package com.echorand.demo.actuators;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class QUEUEHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        if (isQueueUp()) {
            return Health.up()
                    .build();
        } else {
            return Health.down()
                    .withDetail("Error Code", 503)
                    .build();
        }
    }

    private boolean isQueueUp() {
        return false;
    }

}