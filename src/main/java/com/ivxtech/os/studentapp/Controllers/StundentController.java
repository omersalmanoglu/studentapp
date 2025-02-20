package com.ivxtech.os.studentapp.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ivxtech.os.studentapp.Models.Student;
import com.ivxtech.os.studentapp.Repositories.StundentRepository;



@RestController
public class StundentController {

    @Autowired
    private StundentRepository repository;

    @GetMapping("/studentbylastname")
    public List<Student> findByLastName(@RequestParam(value = "lastname") String lastName){
        return repository.findByLastName(lastName);
    }

    @GetMapping("/studentbyid")
    public Optional<Student> findById(@RequestParam(value = "id") String id){
        return repository.findById(id);
    }

    @GetMapping("/students")
    public List<Student> findAll(){
        return repository.findAll();
    }

    @PostMapping(value = "/student", consumes = "application/json", produces = "application/json")
    public Student postMethodName(@RequestBody Student student) {
        return repository.save(student);
    }

}
