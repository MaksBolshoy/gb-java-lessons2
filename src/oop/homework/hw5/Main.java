package oop.homework.hw5;

public class Main {
    private  static final KlassDb db = new KlassDb();
    private static  final StudentDb dbs = new StudentDb();
    private static final PerformanseDb performanseDb = new PerformanseDb();
    public static void main(String[] args) {
        Klass klass7b =new Klass(4,"7b");
        Klass klass11b =new Klass(2,"11b");
        Performanse performanse1 = new Performanse(1, 1,SchoolSubject.ENGLISH,Grade.ADEQUATELY);
        Performanse performanse2 = new Performanse(1, 1,SchoolSubject.CHEMISTRY,Grade.ADEQUATELY);
        Performanse performanse3 = new Performanse(1, 1,SchoolSubject.PHYSIC,Grade.GREAT);
        performanseDb.add(performanse1).add(performanse2).add(performanse3);

        db.addKlass(klass7b).addKlass(klass11b);
        Student student = new Student(1,"Oleg","Ivanov","26.11.1990",4 ,performanseDb);
        Student student1 = new Student(2,"Oly","Ivanova","11.11.1990",2, performanseDb);
        Student student2 = new Student(3,"Timur","Petrov","13.01.1990",4,performanseDb );
        klass7b.add(student);
        klass7b.add(student2);
        klass11b.add(student1);
        dbs.addStudent(student).addStudent(student1).addStudent(student2);
        //System.out.println(dbs.getStudent(3));
        //System.out.println(dbs.getAllStudents());
        dbs.removeStudent(1);
        //System.out.println(dbs.getAllStudents());
        System.out.println(db.getStudentsInklass(2));
        System.out.println(db.getStudentsInklass(4));
        System.out.println(student.getPerformanse());
    }
}
