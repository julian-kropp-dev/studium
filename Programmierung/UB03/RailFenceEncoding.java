package UB03;

public class RailFenceEncoding {
    public static void main(String[] args) {

        String text = "gartenzauntransposition";
        char[] sequence = text.toCharArray();
        char[] sequenceEncoded = new char[sequence.length];
        int i1 = 0;
        int i2 = (int) Math.ceil((double) sequence.length / 2);
        for (int i = 0; i < sequence.length; i++) {
            if (i % 2 == 0) {
                sequenceEncoded[i1] = sequence[i];
                i1++;
            } else {
                sequenceEncoded[i2] = sequence[i];
                i2++;
            }
        }

        String code = String.copyValueOf(sequenceEncoded);
        System.out.println(code);

        // char[] sequenceDecoded

        // text = String.copyValueOf(sequenceDecoded);
        // System.out.println(text);
    }
}
