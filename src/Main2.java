public class Main2 {

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
}}
