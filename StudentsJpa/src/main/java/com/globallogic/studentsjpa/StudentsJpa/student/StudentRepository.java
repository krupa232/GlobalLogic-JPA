package com.globallogic.studentsjpa.StudentsJpa.student;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByNrIndeksu(Long nr_indeksu);
}