package Lesson1;

public class main {
    public static void main(String[] args) {
        PrintTreeWords();
        checkSumSign();
        PrintColor();
        CompareNumbers();

    }

    public static void PrintTreeWords() {
        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    public static void checkSumSign() {
        int a = 25;
        int b = -30;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void PrintColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void CompareNumbers() {
        int a = 10;
        int b = 30;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }
    }


}
