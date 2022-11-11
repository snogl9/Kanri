package it.bjjbz.kanri.person;

import com.sun.istack.NotNull;
import it.bjjbz.kanri.payment.Payment;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Set;

@Entity
@Table(name = "KANRI_PERSON")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(nullable = false)
    private String surname;
    private String firstname;
    @NotNull
    @Column(nullable = false)
    private String sex;
    @NotNull
    @Column(name = "dateofbirth", nullable = false)
    private LocalDate dateOfBirth;
    @Column(name = "mobilephone")
    private String mobilePhone;
    private String email;
    private String address;
    @Column(name = "zipcode")
    private String zipCode;
    @Column(name = "mediccertificatevaliduntil")
    private LocalDate medicCertificateValidUntil;
    @Column(name = "placeofbirth")
    private String placeOfBirth;
    @Column(name = "fiscalcode")
    private String fiscalCode;
    private String comment;

    @Transient
    private Integer age;

    @OneToMany(mappedBy="kanri_person")
    private Set<Payment> paymentSet;

    public Person() {
    }

    public Person(Long id, String surname, String firstname,
                  String sex, LocalDate dob, String mobilePhone,
                  String email, String address, String zipCode,
                  LocalDate medicCertificateValidUntil, String placeOfBirth,
                  String fiscalCode, String comment) {
        this.id = id;
        this.surname = surname;
        this.firstname = firstname;
        this.sex = sex;
        this.dateOfBirth = dob;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.medicCertificateValidUntil = medicCertificateValidUntil;
        this.placeOfBirth = placeOfBirth;
        this.fiscalCode = fiscalCode;
        this.comment = comment;
    }

    public Person(String surname, String firstname, String sex,
                  LocalDate dob, String mobilePhone, String email, String address,
                  String zipCode, LocalDate medicCertificateValidUntil,
                  String placeOfBirth, String fiscalCode, String comment) {
        this.surname = surname;
        this.firstname = firstname;
        this.sex = sex;
        this.dateOfBirth = dob;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.address = address;
        this.zipCode = zipCode;
        this.medicCertificateValidUntil = medicCertificateValidUntil;
        this.placeOfBirth = placeOfBirth;
        this.fiscalCode = fiscalCode;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public LocalDate getMedicCertificateValidUntil() {
        return medicCertificateValidUntil;
    }

    public void setMedicCertificateValidUntil(LocalDate medicCertificateValidUntil) {
        this.medicCertificateValidUntil = medicCertificateValidUntil;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getAge() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", sex='" + sex + '\'' +
                ", dob=" + dateOfBirth +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", medicCertificateValidUntil=" + medicCertificateValidUntil +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", comment='" + comment + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
