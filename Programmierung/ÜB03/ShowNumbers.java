public class ShowNumbers {
    public static void main(String[] args) {
        int[] data = new int[] { 1, 2, 3, 4, 2 };
        int i = 0;
        for (int v : data) {
            i++;
            System.out.print(v);
            if (i < data.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}