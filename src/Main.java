public class Main { // Или имя вашего класса

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        printThreeWords(); // Вызов метода для печати слов
    }
}

public class Main2 { // Или имя вашего класса

    public static void checkSumSign() {
        int a = 10; // Инициализация переменной a любым целым числом
        int b = -5; // Инициализация переменной b любым целым числом
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main2(String[] args) {
        checkSumSign(); // Вызов метода
    }
}