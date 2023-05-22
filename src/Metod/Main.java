package Metod;

public class Main {
    public static void main(String[] args) {
       // Calculator kalk = new Calculator();//переменная с именем kalk  и тип переменной Calculator
       // System.out.println(kalk.sum(2, 3));//это когда метод относится к экземпляру класса . когда не статик .
        // System.out.println(Calculator.sum(2, 4)); // если метод относиться к класу(static) то при вызове метода  надо написать
        // имя класса и имя метода через точку
        Calculator s = new Calculator();
       // float sinus = 5f;// это создание примитивной переменной . примитивы: int, float, double,char,booolean, short,
        //Float sinus1 = Float.parseFloat("5");// по имени класса
         // в данном случае Float это обертка над примитивом float
        //System.out.println(s.getStringLength("     "));
        //s.getEvenNumbers(30);// передавать конкретное значение 30
       //s.enterTheNumberOfLetters("Клава любит карла а карл любит   клаву ", "v");
       s.writeInFile("Максим сегодня молодец ");
    }

}
