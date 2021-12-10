package UB06;

public class Aufgabe3 {

    public static int[] array = { 3, 4, 6, 3, 5, 7 };
    public static int length = 2 * array.length - 1;

    public static void main(String[] args) {

        stepSum(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();

        stepSumRightAlign(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void stepSum(int[] input) {

        int[] result = new int[input.length - 1];

        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                result[i - 1] = input[i] + input[i - 1];
            }
            stepSum(result);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static void stepSumRightAlign(int[] input) {

        int[] result = new int[input.length - 1];

        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                result[i - 1] = input[i] + input[i - 1];
            }
            stepSumRightAlign(result);

            int digits = 0;
            for (int i = 0; i < result.length; i++) {
                digits += (int) (Math.log10(result[i]) + 1);
            }
            if (length - (result.length - 1 + digits) > 0) {
                System.out.print(repeat(length - (result.length - 1 + digits)));
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }

    public static String repeat(int count) {
        return new String(new char[count]).replace("\0", " ");
    }
}
