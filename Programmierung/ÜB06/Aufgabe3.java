package ÜB06;

public class Aufgabe3 {
    public static void main(String[] args) {

        int[] input = { 2, 4, 1, 3, 7 };
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        stepSum(input);
    }

    public static void stepSum(int[] input) {

        int[] result = new int[input.length - 1];
        if (input.length > 1) {
            for (int i = 1; i < input.length; i++) {
                result[i - 1] = input[i] + input[i - 1];
            }
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            stepSum(result);
        }
    }
}
