package by.naumenka.lesson12;

//Допустим есть txt файл с номерами документов.
//Номером документа является строка, состоящая из букв и цифр(без
//служебных символов).
//Пусть этот файл содержит каждый номер документа с новой строки и в
//строке никакой другой информации, только номер документа.
//Валидный номер документа должен иметь длину 15 символов и
//начинаться с последовательности docnum(далее любая
//последовательность букв/цифр) или contract(далее любая
//последовательность букв/цифр).
//Написать программу для чтения информации из входного файла - путь к
//входному файлу должен задаваться через консоль.
//Программа должна проверять номера документов на валидность.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


        System.out.println("Введите ваш путь к файлу");
        String path = new Scanner(System.in).nextLine(); //  C:/TeachMeSkillsProjects/file.txt

        BufferedReader file = new BufferedReader(new FileReader(path));

        String documentNumber;
        while ((documentNumber = file.readLine()) != null) {
            System.out.println("Номер документа: " + documentNumber);

            Document.startDocument(documentNumber);
            Document.lengthDocument(documentNumber);
            Document.checkAnotherSymbol(documentNumber);
            System.out.println();
        }
    }
}