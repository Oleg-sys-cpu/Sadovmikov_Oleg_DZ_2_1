public class sumChecker {
    /**
     * Проверяет, лежит ли сумма двух целых чисел в пределах от 10 до 20 (включительно).
     *
     * @param a Первое целое число.
     * @param b Второе целое число.
     * @return true, если сумма лежит в пределах от 10 до 20, false в противном случае.
     */
    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void main(String[] args) {
        System.out.println(checkSumRange(5, 7));   // Вывод: true
        System.out.println(checkSumRange(2, 6));   // Вывод: false
        System.out.println(checkSumRange(10, 10));  // Вывод: true
        System.out.println(checkSumRange(5, 16));  // Вывод: true
        System.out.println(checkSumRange(1, 2));   // Вывод: false
    }
}
