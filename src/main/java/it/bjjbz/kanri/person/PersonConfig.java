package it.bjjbz.kanri.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PersonConfig {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository) {
        return args -> {
            Person simon = new Person(
                    "Nogler",
                    "Simon",
                    "M",
                    LocalDate.of(1973, Month.JUNE, 30),
                    "3384321572",
                    "simon.nogler@gmail.com",
                    "Kaltern Trutsch 6",
                    "39052",
                    LocalDate.of(2022, Month.DECEMBER, 31),
                    "Bozen",
                    "NGLSMN73H30A952V", "This is a comment");

            Person elias = new Person(
                    "Nogler",
                    "Elias",
                    "M",
                    LocalDate.of(2009, Month.MAY, 7),
                    "25252343",
                    "elias.nogler@gmail.com",
                    "Kaltern Trutsch 6",
                    "39052",
                    LocalDate.of(2022, Month.DECEMBER, 31),
                    "Bozen",
                    "ELXXX", "This is a comment2");

            repository.saveAll(List.of(simon, elias));


        };

    }
}
