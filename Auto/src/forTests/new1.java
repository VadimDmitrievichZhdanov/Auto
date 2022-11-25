package forTests;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class new1 {
    public static void main(String[] args) {
        ArrayList<BigDecimal> bi = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            bi.add(BigDecimal.valueOf(i*100000000));
            System.out.println(bi);
        }
    }
}
