package oop.homework.hw5;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    public int id;
    public String name;
    public List<Student> students;
    public Klass(int id, String name) {
        this.id = id;
        this.name = name;
        this.students =new ArrayList<>();
    }
     public  void add(Student student){
        students.add(student);
     }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Klass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
