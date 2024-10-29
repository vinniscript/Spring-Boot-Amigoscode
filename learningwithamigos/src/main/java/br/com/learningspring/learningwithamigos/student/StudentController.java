package br.com.learningspring.learningwithamigos.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "ap1/v1/student") // localhost:8080/ap1/v1/student will be the path to access this controller.
                                                // This is a good practice to version the API.
public class StudentController {

    private final StudentService studentService; // This is a dependency injection, it is a good practice to use it. It makes the code more testable.
                                                    // It is a way to inject the dependency into the class.

    public StudentController(StudentService studentService) { // Constructor
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}