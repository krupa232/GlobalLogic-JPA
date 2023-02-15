package com.globallogic.studentsjpa.StudentsJpa.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentByNrIndeksu(Long indeks) {
        return studentRepository.findByNrIndeksu(indeks);
    }
}