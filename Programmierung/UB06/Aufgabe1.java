package UB06;

public class Aufgabe1 {
    public static void main(String[] args) {

        int[] numbers1D = { 9, 1, 5, 5 };
        System.out.println("Sum1D: " + arraySum1D(numbers1D));

        int[][] numbers2D = { { 9, 1, 5, 5 }, { 3, 4 }, { 5, 9, 4, 0 } };
        System.out.println("Sum2D: " + arraySum2D(numbers2D));

        int[][][] numbers3D = { { {} } }; // { { { 9, 1, 5, 5 }, { 3, 4 }, { 5, 9, 4, 0 } }, { { 3, 4 }, { 7, 3 } } };
        System.out.println("Sum3D: " + arraySum3D(numbers3D));
        System.out.println("Average3D: " + average3D(numbers3D));
    }

    public static int arraySum1D(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public static int arraySum2D(int[][] numbers) {
        int result = 0;
        for (int[] array : numbers) {
            result += arraySum1D(array);
        }
        return result;
    }

    public static int arraySum3D(int[][][] numbers) {
        int result = 0;
        for (int[][] array : numbers) {
            result += arraySum2D(array);
        }
        return result;
    }

    public static double average3D(int[][][] numbers) {
        double result = 0D;
        int sum = arraySum3D(numbers);

        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int k = 0; k < numbers[i][j].length; k++) {
                    length++;
                }
            }
        }
        if (length <= 0) {
            return 0D;
        }
        result = (double) sum / (double) length;
        return result;
    }
}