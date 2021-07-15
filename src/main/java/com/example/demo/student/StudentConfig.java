package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student marrieum = new Student(1L,
                    "Marrieum",
                    "marrieum.mazhar@gmail.com",
                    LocalDate.of(1990, OCTOBER, 7));

            Student alex = new Student(2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, OCTOBER, 7));

            studentRepository.saveAll(
                    List.of(marrieum,alex)
            );
        };
    }
}
