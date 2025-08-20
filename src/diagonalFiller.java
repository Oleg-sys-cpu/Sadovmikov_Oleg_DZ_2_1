import java.util.Arrays;
public class diagonalFiller {
    /**
     * Заполняет главную диагональ квадратного двумерного массива единицами.
     * Главная диагональ - элементы, у которых индексы строки и столбца совпадают.
     *
     * @param matrix Квадратный двумерный целочисленный массив.
     */
    public static void fillMainDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1; // Заполняем элемент на главной диагонали единицей.
        }
    }
    public static void fillSecondaryDiagonal(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][matrix.length - 1 - i] = 1; // Заполняем элемент на побочной диагонали.
        }
    }

    public static void main(String[] args) {
        int size = 5; // Размер квадратного массива.
        int[][] myMatrix = new int[size][size]; // Создаем квадратный массив.

        System.out.println("Исходный массив:");
        for (int[] row : myMatrix) {
            System.out.println(Arrays.toString(row));
        }

        fillMainDiagonal(myMatrix); // Заполняем главную диагональ единицами.

        fillSecondaryDiagonal(myMatrix); // Заполняем побочную диагональ единицами.

        System.out.println("\nМассив с заполненной главной диагональю:");
        for (int[] row : myMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
