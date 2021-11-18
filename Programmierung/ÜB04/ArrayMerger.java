package ÜB04;

public class ArrayMerger {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 3, 3, 5, 6, 9 };
        int[] arr2 = new int[] { 2, 3, 5, 7, 8, 9, 10 };
        int[] result = new int[arr1.length + arr2.length];
        int lang = arr1.length;
        if (arr1.length < arr2.length) {
            lang = arr2.length;
        }
        for (int j = 0; j < lang; j++) {
            if (arr1.length > j && arr2.length > j) {
                if (arr1[j] < arr2[j]) {
                    result[2 * j] = arr1[j];
                    result[2 * j + 1] = arr2[j];
                } else {
                    result[2 * j] = arr2[j];
                    result[2 * j + 1] = arr1[j];
                }
            } else if (arr1.length <= j) {
                result[2 * arr1.length] = arr2[j];
            } else if (arr2.length <= j) {
                result[2 * (arr2.length + j - (arr1.length - arr2.length))] = arr1[j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}