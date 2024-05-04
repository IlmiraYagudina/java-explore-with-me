package ru.practicum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ExploreWithMeMainService {
    public static void main(String[] args) {
        SpringApplication.run(ExploreWithMeMainService.class, args);

    }
}
