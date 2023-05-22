package Metod;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Calculator {
    public   int sum(int a, int b){
        return  a+b;
    }
    public int getStringLength(String das){ //обращение к переменной по имени  das.
        das = das.replace(" ", "");// заменяем значение переменной das на новое
        das.trim();
        return das.length();//вернуть имя переменной . метод этого класса возврата длинны

    }
    public List<Integer> getEvenNumbers(int number){
        List<Integer> result= new ArrayList<>();
        for (int i = 0; i <= number; i++) {
           if( i%2==0){
               result.add(i);
           }
        }
        System.out.println(result);
        return result;
    }
    // написать метод принимающий строку и возвращающий колличество букв "А" в строке, если такие буквы там есть .
    //если не содержит то бросить исключение
    public  int enterTheNumberOfLetters(String str,String findedStr){ // метод может принимать неограниченное кол во аргументов
        // сигнатурой метода называется имя метода плюс принимаемые аргументы .
        str=str.toLowerCase();//делаем строку  из маленьких букв
        findedStr=findedStr.toLowerCase();//делаем строку  из маленьких букв
        int result =0;
        String[] arr = str.split("");// делаем из строки массив строк
        List<String> list = Arrays. asList(arr);// делаем из массива строк список строк для удобства работы с данными
        if(list.contains(findedStr)){ // проверяем есть ли а в строке
            for (String s : arr) { // тоже самое что цикл фори
                if (s.equalsIgnoreCase(findedStr)) {// если есть то считаем колличество
                    result++;
                }

            }
            System.out.println(result);
            return result;
        } else {// если нет а в строке то создаем исключительную сситуацию ( бросаем исключение )
            throw new SymbolNotFoundException("Буквы "+findedStr+" нет в этой строке "); // +   +  склеиваем строку
        }



    }
    //метод который ничего не возвращает . Принимает строку от пользователя и записывает ее в файл .

    public void writeInFile(String arg){
        File file =new File("str.txt");
        try (FileWriter writer =new FileWriter(file)){                                                     //  в блоке try прогер пишет код который выполнится если не будет исключений
            writer.write(arg); // запиши
           /// writer.flush(); //сохрани изменения и закрой файл
        } catch (IOException e) {                                // в блоке catch пишем логику которую выполнит прога если будет исключение
            throw new RuntimeException(e);
        }

    }

}
// try with resources поробуй с  ресурсами try (FileWriter writer =new FileWriter(file)) нужна чтобы не делать flush()
// принимает все что имплементирует Closeable