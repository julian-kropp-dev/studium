package UB02;

import java.math.BigInteger;

public class StarDistance {
    public static void main(String[] args) {
        BigInteger d1 = new BigInteger("8000000000000000000");
        BigInteger d12 = new BigInteger("3000000000000000000");
        BigInteger d2 = d1.add(d12);
        System.out.println(d2);
    }
}
