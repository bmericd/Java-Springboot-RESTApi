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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student gizem = new Student(
                    "Gizem",
                    "gizem@gmail.com",
                    LocalDate.of(1998, Month.AUGUST,30)
            );
            Student osman = new Student(
                    "Osman",
                    "osman@gmail.com",
                    LocalDate.of(1992, Month.SEPTEMBER,26)
            );

            repository.saveAll(
                    List.of(gizem,osman)
            );
        };
    }
}
