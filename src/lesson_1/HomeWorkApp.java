package lesson_1;

public class HomeWorkApp {
    public static void main(String[] args) {
       //Q1
        printThreeWords();
        /**
         * Создайте метод printThreeWords(), который при вызове должен
         * отпечатать в столбец три слова: Orange, Banana, Apple

         */

       //Q2
        checkSumSign();
        /**
         * Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, .
         * и инициализируйте их любыми значениями, которыми захотите
         *
         *  Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
         *  то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
         *
         */
        //Q3
        printColor();
        /**
         * Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
         *  Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”,
         *   если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”,
         *  если больше 100 (100 исключительно) - “Зеленый”;

         */

        //Q4
        compareNumbers();
        /**
         *Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и
         *инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
         *то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
         *
         *
         */
    }


    private static void compareNumbers() {
        int a = 10;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }


    private static void printColor() {
        int value = 100;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


    private static void printThreeWords() {
        System.out.println(" _orange \n _banana \n _apple");
    }

    private static void checkSumSign() {
        int a = 5;
        int b = -7;
        int s = a + b;

        if (s >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }
}





