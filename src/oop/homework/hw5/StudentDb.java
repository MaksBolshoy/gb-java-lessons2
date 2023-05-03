package oop.homework.hw5;

import java.util.*;

public class StudentDb {
    private final Map<Integer,Student> db = new HashMap<>();


    public StudentDb addStudent(Student student){
        db.put(student.getId(),student);
        return this;
    }
    public Student getStudent(int studentId){
        return db.get(studentId);

    }
    public Student removeStudent(int studentId){
       return db.remove(studentId);
    }
    public Collection<Student>  getAllStudents(){
        return  db.values();
    }

}
