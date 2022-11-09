package it.bjjbz.kanri.paymentType;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PaymentTypeConfig {
    @Bean
    CommandLineRunner commandLineRunnerPay(PaymentTypeRepository repository) {
        return args -> {
            PaymentType annuale = new PaymentType(
                    "Annuale",
                    "Jährlich",
                    "Annual",
                    600.0,
                    LocalDate.of(2022, Month.JANUARY, 1),
                    LocalDate.of(2022, Month.DECEMBER, 31)
            );

            PaymentType trimestrale = new PaymentType(
                    "Trimestrale",
                    "Alle 3 Monate",
                    "Every 3 months",
                    210.0,
                    LocalDate.of(2022, Month.JANUARY, 1),
                    LocalDate.of(2022, Month.DECEMBER, 31)
            );

            PaymentType mensile = new PaymentType(
                    "Mensile",
                    "Monatlich",
                    "Monthly",
                    80.0,
                    LocalDate.of(2022, Month.JANUARY, 1),
                    LocalDate.of(2022, Month.DECEMBER, 31)
            );


            repository.saveAll(List.of(annuale, trimestrale, mensile));


        };
    }
}
