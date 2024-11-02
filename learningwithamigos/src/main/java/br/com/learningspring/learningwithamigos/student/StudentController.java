package br.com.learningspring.learningwithamigos.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "ap1/v1/student") // localhost:8080/ap1/v1/student will be the path to access this controller.
                                                // This is a good practice to version the API.
public class StudentController {

    private final StudentService studentService; // This is a bean, it is managed by Spring. It is a dependency.
                                                    // It is a way to inject the dependency into the class.

    public StudentController(StudentService studentService) { // Constructor
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    // In those lines above, we are creating a controller that will return a list of students.

    // In topics, we did:
    // 1. Created a service that returns a list of students.
    // 2. Created a controller that will return the list of students using the get Method of our service.
    // 3. We used the @RestController annotation to indicate that this class is a controller.
    // 4. We used the @RequestMapping annotation to indicate the path to access this controller.
    // 5. We used the @GetMapping annotation to indicate that this method will be called when a GET request is made to the path.
    // 6. We injected the service into the controller using the constructor.
    // 7. We returned the list of students from the service.

}