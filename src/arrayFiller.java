import java.util.Arrays;
public class arrayFiller {
    /**
     * Заполняет целочисленный массив последовательными значениями от 1 до его длины.
     *
     * @param arr Пустой целочисленный массив.
     */
    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Заполняем массив значениями от 1 до 100 (i + 1).
        }
    }

    public static void main(String[] args) {
        int[] myArray = new int[100]; // Создаем пустой массив длиной 100.
        fillArray(myArray); // Заполняем массив.

        System.out.println("Заполненный массив: " + Arrays.toString(myArray)); // Выводим массив.
    }
}
