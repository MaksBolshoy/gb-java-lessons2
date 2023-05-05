package oop.homework.hw5;

import java.util.Scanner;

public class View {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final StudentDb STUDENT_DB = new StudentDb();
    private static final PerformanseDb PERFORMANCE_DB = new PerformanseDb();
    private static final KlassDb KLASS_DB = new KlassDb();

    public static void run() {
        fillDb();
        while (true) {
            System.out.println("Это программа для работы со студентами учебного заведения.");
            String choice = prompt("Хотите продолжить? (y - да, n - нет)");
            switch (choice) {
                case "y":
                    String commands = prompt("1 - добавить класс,\n2 - добавить студента,\n3 - добавить запись об успеваемости,\n4-удалить класс,\n" +
                            "5-посмотреть всех студентов \n6- посмотреть все классы\n7-посмотреть студентов в классе\n8- посмотреть студентоа по ID\n" +
                            "9-посмотреть студента по успеваемости\n10-удалить студента\n");
                    getCommands(commands);
                    break;
                case "n":
                    exit();
                default:
                    System.out.println("Введена некорректная команда");
            }
        }
    }

    private static void getCommands(String commands) {
        switch (commands) {
            case "1" -> createKlass();
            case "2" -> createStudent();
            case "3" -> createPerformance();
            case "4" -> removeKlass();
            case "5" -> getAllStudent();
            case "6" -> getAllKlasses();
            case "7" -> getStudentsInKlass();
            case "8" -> getStudentById();
            case "9" -> getStudentPerformance();
            case "10"-> removeStudent();
            default -> System.out.println("Введена некорректная команда");
        }
    }
    private static void fillDb(){
        Student a = new Student(1,"Nova","Iduev","11 11 1991",1,PERFORMANCE_DB);
        Student b = new Student(2,"Rova","Iooov","12 11 1991",1,PERFORMANCE_DB);
        Student s = new Student(3,"Lova","Iaaav","13 11 1991",2,PERFORMANCE_DB);
        Student e = new Student(4,"Kova","Ieeev","14 11 1991",2,PERFORMANCE_DB);
        Klass klass = new Klass(1,"a");
        Klass klass2 = new Klass(2,"b");
        Performanse performanse = new Performanse(1,SchoolSubject.ENGLISH,Grade.ADEQUATELY);
        Performanse performanse1 = new Performanse(1,SchoolSubject.PHYSIC,Grade.GOOD);
        Performanse performanse2 = new Performanse(2,SchoolSubject.ENGLISH,Grade.ADEQUATELY);
        STUDENT_DB.addStudent(a).addStudent(b).addStudent(s).addStudent(e);
        KLASS_DB.addKlass(klass).addKlass(klass2);
        PERFORMANCE_DB.add(performanse).add(performanse1).add(performanse2);
    }
    private static void createStudent() {
        int studentId = Integer.parseInt(prompt("Введите id студента: "));
        int klassId = Integer.parseInt(prompt("Введите id класса, где учится студент: "));
        String name = prompt("Введите имя студента: ");
        String surname = prompt("Введите фамилию студента: ");
        String birthday = prompt("Введите дату рождения студента: ");
        Student student = new Student(studentId, name, surname, birthday, klassId, PERFORMANCE_DB);
        if (KLASS_DB.getKlass(klassId) == null) {
            throw new RuntimeException(String.format("Класса с id %s нет в базе данных\n", klassId));
        }
        STUDENT_DB.addStudent(student);
        KLASS_DB.getKlass(klassId).add(student);
        System.out.printf("Студент %s записан в базу данных\n", student);
    }

    private static void removeStudent() {
        int studentId = Integer.parseInt(prompt("Введите id студента: "));
        STUDENT_DB.removeStudent(studentId);
    }

    private static void getStudentPerformance() {
        int studentId = Integer.parseInt(prompt("Введите id студента: "));
        System.out.printf("Успеваемость студента с id %s: %s ", studentId, PERFORMANCE_DB.getPerformansesByStudentId(studentId));
    }

    private static void getAllStudent() {
        for (Student student : STUDENT_DB.getAllStudents()) {
            System.out.println(student);
        }
    }

    private static void getStudentById() {
        int studentId = Integer.parseInt(prompt("Введите id студента: "));
        System.out.println(STUDENT_DB.getStudent(studentId));
    }

    private static void createPerformance() {
        int studentId = Integer.parseInt(prompt("Введите id студента: "));
        SchoolSubject subject = SchoolSubject.valueOf(prompt("Введите предмет: ").toUpperCase());
        Grade grade = Grade.valueOf(prompt("Введите оценку: ").toUpperCase());
        Performanse performanse = new Performanse(studentId, subject, grade);
        PERFORMANCE_DB.add(performanse);
        System.out.printf("Успеваемость студента с id %s, по предмету %s записана в базу данных\n", studentId, subject);
    }

    private static void createKlass() {
        int klassId = Integer.parseInt(prompt("Введите id класса: "));
        String name = prompt("Введите название класса: ");
        Klass klass = new Klass(klassId, name);
        KLASS_DB.addKlass(klass);
        System.out.printf("Класс %s записан в базу данных\n", name);
    }

    private static Klass getKlassById() {
        int klassId = Integer.parseInt(prompt("Введите id класса: "));
        if (KLASS_DB.getKlass(klassId) == null) {
            throw new RuntimeException(String.format("Класса с id %s нет в базе данных\n", klassId));
        }
        Klass klass = KLASS_DB.getKlass(klassId);
        System.out.println(klass);
        return klass;
    }

    private static void getStudentsInKlass() {
        Klass klass = getKlassById();
        for (Student student : klass.getStudents()) {
            System.out.println(student);
        }
    }

    private static void getAllKlasses() {
        System.out.println(KLASS_DB.getAllKlasses());
    }

    private static void removeKlass() {
        Klass klass = getKlassById();
        KLASS_DB.removeKlass(klass.getId());
    }

    private static void exit() {
        System.exit(0);
    }


    private static String prompt(String command) {
        System.out.println(command);
        return SCANNER.next();
    }


}

