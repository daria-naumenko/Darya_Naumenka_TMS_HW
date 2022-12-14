package by.naumenka.lesson11.task1;

//Доработать нулевое домашнее задание предыдущего урока.
// Теперь надо создать свои классы исключений на каждую ситуацию:
// - Проверить содержит ли номер документа последовательность abc.
// - Проверить начинается ли номер документа с последовательности 555.
// - Проверить заканчивается ли номер документа на последовательность 1a2b.
//Если номер документа не удовлетворяет условию - то "бросить" исключение.
//В методе класса, в котором будут вызываться эти методы для демонстрации работы,
// перехватить исключение конструкцией try-catch и в блоке catch вывести сообщение для пользователя
// (сообщение на консоль).

import by.naumenka.lesson11.task1.Exception.ContainsABCException;
import by.naumenka.lesson11.task1.Exception.Start555Exception;
import by.naumenka.lesson11.task1.Exception.End1a2bException;

public class Main {
    public static void main(String[] args) throws Start555Exception, ContainsABCException, End1a2bException {

        String text = "5555-rAt-5670-abc-1a2b";
        System.out.println("Ваш номер документа: " + text);

        Document.firstMethod(text);
        Document.secondMethod(text);
        Document.thirdMethod(text);
        Document.fourthMethod(text);
        Document.fifthMethod(text);
        Document.sixthMethod(text);
        Document.seventhMethod(text);
    }
}