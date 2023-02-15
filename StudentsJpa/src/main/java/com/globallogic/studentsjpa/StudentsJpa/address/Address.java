package com.globallogic.studentsjpa.StudentsJpa.address;

import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity()
@Data
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String adres;
}
