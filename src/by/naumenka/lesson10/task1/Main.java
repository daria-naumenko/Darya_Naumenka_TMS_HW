package by.naumenka.lesson10.task1;

public class Main {
    public static void main(String[] args) {

        String text = "1444-rAt-5670-abc-0d3A";
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