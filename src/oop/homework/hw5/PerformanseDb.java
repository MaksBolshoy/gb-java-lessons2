package oop.homework.hw5;

import java.util.HashMap;
import java.util.Map;

public class PerformanseDb {
    private final Map<Integer, Performanse> db =new HashMap<>();
    public PerformanseDb add(Performanse performanse){
        db.put(performanse.getStudentId(),performanse);
        return this;
    }
    private Performanse getPerformansById(int performanseId){
        Performanse performanse = null;
        for(Performanse p: db.values()){
            if(p.getId()==performanseId){
                performanse =p;
            }
        }
        return performanse;
    }
    public Performanse getPerformanseByStudentId(int studentId){
        //Performanse performanse =
        for (int i = 0; i < db.values().size(); i++) {
            Performanse performanse = getPerformansById(i);
            if(performanse.getStudentId()==studentId){
                return performanse;
            }

        }
        return null;
    }

    public Map<Integer, Performanse> getDb() {
        return db;
    }
}
