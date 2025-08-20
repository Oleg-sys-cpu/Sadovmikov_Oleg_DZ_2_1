import java.util.Arrays;
public class arrayMultiplier {
    /**
     * Умножает на 2 все элементы массива, которые меньше 6.
     *
     * @param arr Целочисленный массив.
     */
    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2; // Умножаем элемент на 2.  Эквивалентно arr[i] = arr[i] * 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(myArray));

        multiplyLessThanSix(myArray);
        System.out.println("Измененный массив: " + Arrays.toString(myArray));
    }
}
