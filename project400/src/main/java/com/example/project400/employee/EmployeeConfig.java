package com.example.project400.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee shaina = new Employee(
                    "Shaina",
                    "McGovern",
                    "shaina@mail.com",
                    "0871126409",
                    LocalDate.of(1994, Month.JUNE, 24),
                    11.50,
                    false);
            Employee harry = new Employee(
                    "Harry",
                    "Flanagan",
                    "harry@mail.com",
                    "0871126409",
                    LocalDate.of(1997, Month.JUNE, 30),
                    15.50,
                    true);
            Employee rich = new Employee(
                    "Richard",
                    "Doherty",
                    "rich@mail.com",
                    "0871126444",
                    LocalDate.of(1991, Month.NOVEMBER, 26),
                    12.50,
                    true);
            Employee karen = new Employee(
                    "Karen",
                    "O'Dowd",
                    "karen@mail.com",
                    "0834564409",
                    LocalDate.of(1994, Month.APRIL, 2),
                    10.50,
                    false);
            repository.saveAll(
                    List.of(shaina, harry, rich, karen)
            );
        };
    }
}