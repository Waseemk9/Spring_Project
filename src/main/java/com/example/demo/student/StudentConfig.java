package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yaml.snakeyaml.events.Event;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository repository){
        return args -> {
            Student Waseem =new Student(
                   "waseem",
                    LocalDate.of(1998, APRIL,9),
                    21,
                    "waseem@gmail.com"

            );
           Student Rocky = new Student(
                    "Rocky",
                    LocalDate.of(1999, APRIL,3),
                    21,
                    "rocky@gmail.com"
            );
            repository.saveAll(
                    List.of(Waseem, Rocky)
            );

        };
    }
}
