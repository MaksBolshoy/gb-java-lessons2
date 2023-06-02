package oop.homework.hw8.employees;

import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {
            System.out.println("Введите команду (0- выйти , 1-посмотреть всех пользователей , 2 - посмотреть пользователя по ID ): ");
            int comand = Integer.parseInt(getData());
            if (comand == 1) {
                System.out.println(EmployeeDb.Db);
            } else if (comand == 2) {
                System.out.println("Введите id пользователя ");
                int id = Integer.parseInt(getData());
                if (!EmployeeDb.Db.containsKey(id)) {
                    System.out.println("Пользователь с таким id не найден ");
                }
                System.out.println(EmployeeDb.Db.get(id));

            } else if (comand == 0) {
                System.exit(0);

            } else System.err.println("Вы ввели неверную команду ");
        }

    }

    private static String getData() {
        return scanner.next();
    }
}
