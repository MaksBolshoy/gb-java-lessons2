package oop.homework.hw5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected int id;
    protected  String name;
    protected String surname;
    protected String dateOfBirth;
    protected int klassId;
    private PerformanseDb db;

    public Student(int id, String name, String surname, String dateOfBirth, int klassId, PerformanseDb db) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.klassId =klassId;
        this.db= db;
    }
     public List<Performanse> getPerformanse(){
        List<Performanse> result =new ArrayList<>();

        for(Performanse p:db.getDb().values()){
            if(p.getStudentId()==this.id){
                result.add(p);
            }
        }
        return result;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getKlassId() {
        return klassId;
    }

    public void setKlassId(int klassId) {
        this.klassId = klassId;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
