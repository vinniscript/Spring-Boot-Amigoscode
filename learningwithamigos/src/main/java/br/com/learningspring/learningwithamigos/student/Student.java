package br.com.learningspring.learningwithamigos.student;

import java.time.LocalDate;

public class Student { // This class is a model, it represents the data that will be used in the application.
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(Long id) { // Our constructor

    }

    public Student(Long id, // This constructor is used to create a new student.
                   String name,
                   String email,
                   LocalDate dob,
                   int age
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, // A constructor without the id, the database will generate it.
                   int age,
                   String email,
                   LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // toString method, this serves to return the object in a string format. It is useful for debugging.

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                '}';
    }
}
