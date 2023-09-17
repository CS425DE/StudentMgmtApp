package edu.mum.cs.cs425.studentmgmt.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    private Long studentId ;

    private String studentNumber ; //(required) (e.g. Data values: 000-61-0001, 000-61-0002, etc.)
    private String firstName ;// (required) (e.g.  Data values: "Anna", "Bob" etc.)

    private String middleName ;// (is optional) (e.g.  Data values: "Lynn", "" etc.)

    private String lastName ; // (required) (e.g.  Data values: "Smith", "Galverston" etc.)
    private double cgpa;  //  (is optional) (e.g. Data values: 3.45, 2.87, etc)
   private LocalDate dateOfEnrollment ; //(This field contains date values; representing the date of enrollment of the student)


    @OneToOne(cascade = CascadeType.ALL)

    private  Transcript transcript;


    @OneToOne(cascade = CascadeType.ALL)
    private Classroom classroom;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public LocalDate getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Student(Long studentId, String studentNumber, String firstName, String middleName, String lastName, double cgpa, LocalDate dateOfEnrollment) {
        this.studentId = studentId;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.cgpa = cgpa;
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", transcript=" + transcript +
                ", classroom=" + classroom +
                '}';
    }
}
