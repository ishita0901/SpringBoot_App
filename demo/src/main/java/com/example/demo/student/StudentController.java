package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//this class will have all the resources for our API
@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping("/")
    public List<Student> getStudents() {
        return List.of(new Student(
                        1L,
                        "Ishita",
                        "ishita0909@gmail.com",
                        LocalDate.of(2001, Month.AUGUST, 5),
                        21
                )
        );
    }
}
