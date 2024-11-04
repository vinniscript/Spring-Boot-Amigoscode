package br.com.learningspring.learningwithamigos.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// This will be responsible for the data access layer.
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long > { // JpaRepository works with the entity and the type of the primary key.



}
