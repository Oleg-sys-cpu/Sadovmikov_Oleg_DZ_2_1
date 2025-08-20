public class negativeChecker {
    /**
     * Проверяет, является ли целое число отрицательным.
     * Ноль считается положительным числом.
     *
     * @param number Целое число для проверки.
     * @return true, если число отрицательное, false - если положительное или равно нулю.
     */
    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void main(String[] args) {
        System.out.println(isNegative(5));   // Вывод: false
        System.out.println(isNegative(-3));  // Вывод: true
        System.out.println(isNegative(0));   // Вывод: false
    }
}
