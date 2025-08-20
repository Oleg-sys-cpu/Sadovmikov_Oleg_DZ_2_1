import java.util.Arrays;
public class binaryArrayInverter {
    /**
     * Инвертирует элементы массива, состоящего из 0 и 1 (заменяет 0 на 1, а 1 на 0).
     *
     * @param arr Целочисленный массив, состоящий из 0 и 1.
     */
    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Исходный массив: " + Arrays.toString(binaryArray));

        invertArray(binaryArray);
        System.out.println("Инвертированный массив: " + Arrays.toString(binaryArray));
    }
}
