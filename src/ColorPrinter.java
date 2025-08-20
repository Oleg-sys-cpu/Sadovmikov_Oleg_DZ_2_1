public class ColorPrinter {

    public static void printColor() {
        int value = 50; // Инициализируем переменную value любым значением

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        printColor(); // Вызываем метод printColor для выполнения
    }
}
