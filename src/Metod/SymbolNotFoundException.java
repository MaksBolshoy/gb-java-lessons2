package Metod;

public class SymbolNotFoundException extends RuntimeException {
    public SymbolNotFoundException() {
        super(); //вызовется конструктор RuntimeException родительского класса
    }

    public SymbolNotFoundException(String message) {
        super(message); //вызовется конструктор RuntimeException родительского класса принимающий от пользователя строку
    }
}
