package com.globallogic.studentsjpa.StudentsJpa.student;

import lombok.*;
import jakarta.persistence.*;
import com.globallogic.studentsjpa.StudentsJpa.address.Address;



@Entity(name = "STUDENTS")
@Getter
public class Student {

    @Id
    @GeneratedValue
    private Long nrIndeksu;

    private String imie;
    private String nazwisko;

    @ManyToOne()
    @JoinColumn(name = "adres", referencedColumnName = "id", nullable = false)
    private Address address;

}
