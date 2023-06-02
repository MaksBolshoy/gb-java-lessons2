package oop.homework.hw8.employees;

import java.util.LinkedHashMap;
import java.util.Map;

public class EmployeeDb {
    public final static Map<Integer,Employee> Db =new LinkedHashMap<>();
    public   static  void  createDb(){
        Db.put(1,new Employee("Bodov","Bax","Dira",30000));
        Db.put(2,new Employee("Sodov","Cax","Men",40000));
        Db.put(3,new Employee("Lodov","Tax","Her",50000));

    }
}
