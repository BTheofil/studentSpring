package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository studentRepository){
        return args -> {
            Student theo = new Student(
                    1L,
                    "Theo",
                    "btheo@gmail.com",
                    LocalDate.of(1999, Month.JUNE, 29)
            );

            Student test = new Student(
                    2L,
                    "Teszt",
                    "teszt@test.hu",
                    LocalDate.of(2005, Month.APRIL, 1)
            );

            studentRepository.saveAll(List.of(theo, test));
        };
    }

}
