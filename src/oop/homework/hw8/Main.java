package oop.homework.hw8;

import oop.homework.hw8.employees.EmployeeDb;
import oop.homework.hw8.employees.EmployeeView;

public class Main {
    public static void main(String[] args) {
        EmployeeDb.createDb();
        EmployeeView.run();
    }
}
