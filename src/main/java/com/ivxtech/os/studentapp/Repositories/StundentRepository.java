package com.ivxtech.os.studentapp.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ivxtech.os.studentapp.Models.Student;

public interface StundentRepository  extends MongoRepository<Student, String>{

    public Student findByFirstName(String firstName);
    public List<Student> findByLastName(String lastName);


}
