public class numberChecker {
    /**
     * Проверяет, является ли целое число положительным или отрицательным, и выводит соответствующее сообщение в консоль.
     * Ноль считается положительным числом.
     *
     * @param number Целое число для проверки.
     */
    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void main(String[] args) {
        checkNumber(5);    // Вывод: Число положительное
        checkNumber(-3);   // Вывод: Число отрицательное
        checkNumber(0);    // Вывод: Число положительное
    }
}

