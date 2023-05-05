package oop.homework.hw5;

import java.util.*;

public class PerformanseDb {
    private final Map<String, Performanse> db =new HashMap<>();
    public PerformanseDb add(Performanse performanse){
        String id =performanse.getStudentId()+performanse.getSubject().name();
        db.put(id,performanse);
        return this;
    }
    private Performanse getPerformansById(String  performanseId){
        Performanse performanse = null;
        for(Performanse p: db.values()){
            if(Objects.equals(p.getId(), performanseId)){
                performanse =p;
            }
        }
        return performanse;
    }
    public List<Performanse> getPerformanseByStudentId(int studentId){
        List<Performanse>result =new ArrayList<>();
        for(Performanse p: db.values()) {
            if(p.getId().startsWith(String.valueOf(studentId))){
                result.add(p);
            }
        }
        return result;
    }
    public boolean isStudentPerformens(Performanse performanse, int studentId){
        return performanse.getId().startsWith(String.valueOf(studentId));
    }
    public List<Performanse> getPerformansesByStudentId(int studentId){
        List<Performanse> result =new ArrayList<>();
        for(Performanse performanse: db.values()){
            if(performanse.getId().startsWith(String.valueOf(studentId))){
                result.add(performanse);
            }
        }
        return result;
    }
    public Map<String, Performanse> getDb() {
        return db;
    }
}
