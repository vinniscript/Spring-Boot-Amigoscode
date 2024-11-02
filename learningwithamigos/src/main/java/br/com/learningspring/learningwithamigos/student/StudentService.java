package br.com.learningspring.learningwithamigos.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

// @Component // It declares that this class is a Spring bean.
            // A bean is a complex concept, but in a simple way, it is a class that is managed by Spring.
             // Being magaged by Spring means that Spring will create an instance of this class and will keep it in a container.
              // Which means that we can inject this class into other classes. This is called dependency injection.
                // Just like an object in a class, but it were created by Spring before.

@Service // This annotation is used to indicate that this class is a service, which means that it will have business logic.
            // @Service is a specialization of @Component, it will be served to other classes, like the Controller class.

public class StudentService { // Now, with the notion of a service, we've declared this class as a service.

    public List<Student> getStudents() { // Bringing a list of Students defined in other package/class.
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        "mariam.jamal@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        ); // This class will be converted to JSON which contains an array of objects.

    }

}
