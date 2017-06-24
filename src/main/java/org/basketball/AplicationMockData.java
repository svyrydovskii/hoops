package org.basketball;

import org.basketball.mock.MockCourtService;
import org.basketball.mock.MockDataGenerator;
import org.basketball.services.CourtService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
@Profile("mock")
public class AplicationMockData {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CourtService getCourtService() {
        return new MockCourtService();
    }

    @Bean
    CommandLineRunner runner(MockDataGenerator mockDataGenerator) {
        return (args) -> {
            mockDataGenerator.generateMockData();
        };
    }
}
