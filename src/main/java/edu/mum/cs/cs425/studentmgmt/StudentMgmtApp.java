package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@SpringBootApplication
public class StudentMgmtApp implements  CommandLineRunner  {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtApp.class, args);

    }

    public   void saveStudent(Student student){


        studentRepository.save(student);


    }


    @Override
    public void run(String... args) throws Exception {
        Student student = new Student(1L, "000-61-0001", "Anna", "Lynn", "Smith", 3.45, LocalDate.of(2019,5,25));

        student.setTranscript(new Transcript(1, "BS Computer Science"));
        // Save the Student object to the database
        student.setClassroom(new Classroom(1, "McLaughlin building", "M105"));
        saveStudent(student);

        studentRepository.findAll().forEach(System.out::println);

    }
}
