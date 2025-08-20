public class leapYearChecker {
    /**
     * Проверяет, является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     *
     * @param year Год для проверки.
     * @return true, если год високосный, false - если нет.
     */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;  // Год делится на 400, значит, високосный.
        } else if (year % 100 == 0) {
            return false; // Год делится на 100, но не на 400, значит, не високосный.
        } else if (year % 4 == 0) {
            return true;  // Год делится на 4, но не на 100, значит, високосный.
        } else {
            return false; // Год не делится ни на 4, ни на 100, ни на 400, значит, не високосный.
        }
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); // Вывод: true
        System.out.println(isLeapYear(2021)); // Вывод: false
        System.out.println(isLeapYear(1900)); // Вывод: false
        System.out.println(isLeapYear(2000)); // Вывод: true
    }
}
