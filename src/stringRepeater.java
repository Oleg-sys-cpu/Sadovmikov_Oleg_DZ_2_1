public class stringRepeater {
    /**
     * Печатает строку в консоль указанное количество раз.
     *
     * @param str   Строка для печати.
     * @param count Количество повторений.
     */
    public static void printString(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        printString("Hello", 3); // Вывод: Hello Hello Hello
        printString("Java", 5);  // Вывод: Java Java Java Java Java
    }
}
