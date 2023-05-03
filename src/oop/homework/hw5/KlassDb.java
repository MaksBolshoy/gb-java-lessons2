package oop.homework.hw5;

import java.util.*;

public class KlassDb {
    private final Map<Integer,Klass> db = new HashMap<>();
    private  final StudentDb studentDb = new StudentDb();

    public KlassDb addKlass(Klass klass){
        db.put(klass.getId(),klass);
        return this;
    }
    public Klass getKlass(int klassId){
        return db.get(klassId);

    }
    public Klass removeKlass(int klassId){
        return db.remove(klassId);
    }
    public Collection<Klass> getAllKlasses(){
        return  db.values();
    }
    public List<Student>getStudentsInklass(int klassId){
      Klass klass = getKlass(klassId);
      return klass.getStudents();
    }
}
