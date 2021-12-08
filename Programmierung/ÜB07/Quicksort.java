package ÜB07;

public class Quicksort {
	public static void main(String[] args) {

		int[] test = new int[] { 6719, 8130, 3157, 9784, 7634, 1675, 5562, 2088, 4358 };
		// int[] a = new int[] { 23, 14, 53, 69, 42, 78, 44, 38, 39 };
		// int[] b = new int[] { 22, 10, 15, 18, 35, 29, 30, 37, 23 };
		// int[] c = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		print(test);
		System.out.println();
		quickSort(test);
		System.out.println();
		print(test);

	}

	public static void print(int[] prnt) {
		System.out.print("[ ");
		for (int k : prnt) {
			System.out.print(k + " ");
		}
		System.out.print("]");
		System.out.println();

	}

	public static void quickSort(int[] keys) {

		quickSort(keys, 0, keys.length - 1);

	}

	private static void quickSort(int[] keys, int leftIndex, int rightIndex) {

		if (rightIndex > leftIndex) {
			int pivotValue = keys[rightIndex];
			int i = leftIndex;
			int j = rightIndex - 1;
			print(keys); // zeitpunkt der richtigen ausgabe
			while (true) {
				while (i < rightIndex && keys[i] <= pivotValue) {
					i = i + 1; // search for key > pivotValue from left to right
				}
				while (j > i && keys[j] >= pivotValue) {
					j = j - 1; // search for key < pivotValue from right to left
				}
				if (i >= j) {
					break; // indices have passed each other, no more keys found
				}

				swap(keys, i, j); // now swap the keys that were found

			}

			swap(keys, i, rightIndex); // move pivot element to proper place

			quickSort(keys, leftIndex, i - 1); // sort left part

			quickSort(keys, i + 1, rightIndex); // sort right part

		}

	}

	private static void swap(int[] keys, int index1, int index2) {

		int tmp = keys[index1];
		keys[index1] = keys[index2];
		keys[index2] = tmp;

	}
}
