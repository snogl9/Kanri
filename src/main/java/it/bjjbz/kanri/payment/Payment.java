package it.bjjbz.kanri.payment;

import com.sun.istack.NotNull;
import it.bjjbz.kanri.paymentType.PaymentType;
import it.bjjbz.kanri.person.Person;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "KANRI_PAYMENT")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull
    private LocalDate date;
    @OneToOne(cascade = CascadeType.ALL) // TODO: 06.11.2022 Überprüfen
    @JoinColumn(name = "payment_type_id", referencedColumnName = "id") // TODO: 06.11.2022 Überprüfen
    private PaymentType type;
    @NotNull
    @Column(nullable = false)
    private Double amount;
    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    private Person person;

}
