import java.util.Arrays;
public class arrayCreator {
    /**
     * Создает одномерный целочисленный массив заданной длины, заполненный указанным значением.
     *
     * @param len           Длина массива.
     * @param initialValue Значение, которым заполняется каждая ячейка массива.
     * @return Одномерный целочисленный массив длины len, каждая ячейка которого равна initialValue.
     */
    public static int[] createArray(int len, int initialValue) {
        int[] newArray = new int[len]; // Создаем новый массив заданной длины.

        // Заполняем массив указанным значением.
        for (int i = 0; i < len; i++) {
            newArray[i] = initialValue;
        }

        return newArray; // Возвращаем созданный массив.
    }

    public static void main(String[] args) {
        int length = 5;
        int value = 10;

        int[] filledArray = createArray(length, value);

        System.out.println("Созданный массив: " + Arrays.toString(filledArray)); // Выводим созданный массив.
    }
}
