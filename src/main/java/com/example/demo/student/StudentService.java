package com.example.demo.student;

//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//Business Layer
//@Component //This is a bean
@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(1L,
                        "marrieum",
                        "marrieum.mazhar@gmail.com",
                        LocalDate.of(1990, Month.OCTOBER,7),
                        30)
        );
    }
}
