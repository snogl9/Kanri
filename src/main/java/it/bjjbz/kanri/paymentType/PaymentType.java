package it.bjjbz.kanri.paymentType;

import com.sun.istack.NotNull;
import it.bjjbz.kanri.payment.Payment;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "KANRI_PAYMENT_TYPE")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull
    private String descriptionItalian;
    private String descriptionGerman;
    private String descriptionEnglish;
    @Column(nullable = false)
    @NotNull
    private Double amount;
    @Column(nullable = false)
    @NotNull
    private LocalDate validFrom;
    private LocalDate validTo;
    @OneToOne(mappedBy = "type") // TODO: 06.11.2022 Überprüfen
    private Payment payment;

    public PaymentType() {
    }

    public PaymentType(String descriptionItalian, String descriptionGerman, String descriptionEnglish,
                       Double amount, LocalDate validFrom, LocalDate validTo) {
        this.descriptionItalian = descriptionItalian;
        this.descriptionGerman = descriptionGerman;
        this.descriptionEnglish = descriptionEnglish;
        this.amount = amount;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public PaymentType(Long id, String descriptionItalian, String descriptionGerman, String descriptionEnglish,
                       Double amount, LocalDate validFrom, LocalDate validTo, Payment payment) {
        this.id = id;
        this.descriptionItalian = descriptionItalian;
        this.descriptionGerman = descriptionGerman;
        this.descriptionEnglish = descriptionEnglish;
        this.amount = amount;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescriptionItalian() {
        return descriptionItalian;
    }

    public void setDescriptionItalian(String descriptionItalian) {
        this.descriptionItalian = descriptionItalian;
    }

    public String getDescriptionGerman() {
        return descriptionGerman;
    }

    public void setDescriptionGerman(String descriptionGerman) {
        this.descriptionGerman = descriptionGerman;
    }

    public String getDescriptionEnglish() {
        return descriptionEnglish;
    }

    public void setDescriptionEnglish(String descriptionEnglish) {
        this.descriptionEnglish = descriptionEnglish;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "descriptionItalian='" + descriptionItalian + '\'' +
                ", amount=" + amount +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                '}';
    }
}
