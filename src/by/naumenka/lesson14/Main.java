package by.naumenka.lesson14;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String input, result = null;
        List<String> sign = Arrays.asList("+", "-", "*", "/");
        List<String> romanNumber = Arrays.asList("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");

        int a = 0, b = 0, action = 0, output = 0;
        boolean roman;

        System.out.print("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();

        try {
            if (Objects.equals(input, "")) {
                System.err.println("Вы ввели пустую строку");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String[] inputSplit = input.split("[+\\-*/]");

        for (int i = 0; i < sign.size(); i++) {
            if (input.contains(sign.get(i))) {
                action = i;
                break;
            }
        }

        if (input.contains(romanNumber.get(1)) || input.contains(romanNumber.get(5)) || input.contains(romanNumber.get(10))) {
            roman = true;
            try {
                for (int i = 0; i < romanNumber.size(); i++) {

                    if (romanNumber.get(i).equals(inputSplit[0]))
                        a = i;
                    if (romanNumber.get(i).equals(inputSplit[1]))
                        b = i;

                }
                for (int i = 0; i < 10; i++) {
                    if (inputSplit[1].contains(String.valueOf(i)) | inputSplit[0].contains(String.valueOf(i))) {
                        System.err.println("Неверный формат записи");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            roman = false;
            try {
                a = Integer.parseInt(inputSplit[0]); // преобразую строку в число
                b = Integer.parseInt(inputSplit[1]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        switch (action) {
            case (0):
                output = a + b;
                result = String.valueOf(a + b);
                break;
            case (1):
                output = a - b;
                result = String.valueOf(output);
                break;
            case (2):
                output = a * b;
                result = String.valueOf(output);
                break;
            case (3):
                output = a / b;
                result = String.valueOf((double) a / (double) b);
                break;
        }

        if (roman) {
            if (output >= 10 && output < 20) {
                result = "X" + romanNumber.get(output - 10);
            } else if (output >= 20 && output < 30) {
                result = "XX" + romanNumber.get(output - 20);
            } else if (output >= 30 && output < 40) {
                result = "XXX" + romanNumber.get(output - 30);
            } else if (output >= 40 && output < 50) {
                result = "XL" + romanNumber.get(output - 40);
            } else if (output >= 50 && output < 60) {
                result = "L" + romanNumber.get(output - 50);
            } else if (output >= 60 && output < 70) {
                result = "LX" + romanNumber.get(output - 60);
            } else if (output >= 70 && output < 80) {
                result = "LXX" + romanNumber.get(output - 70);
            } else if (output >= 80 && output < 90) {
                result = "LX" + "XX" + romanNumber.get(output - 80);
            } else if (output >= 90 && output < 100) {
                result = "XC" + romanNumber.get(output - 90);
            } else if (output == 100) {
                result = "C";
            } else
                result = romanNumber.get(output);
        }
        System.out.println("Ответ: " + result);
    }
}