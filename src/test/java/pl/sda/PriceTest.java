package pl.sda;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PriceTest {
    @Test
    void shouldProperlySubtractPrice() {
        double price1 = 0.01;
        double price2 = 0.03;
        System.out.println(price1-price2);

        BigDecimal price3 = new BigDecimal(0.01);
        BigDecimal price4 = new BigDecimal(0.03);
        System.out.println(price3.subtract(price4));

        BigDecimal price5 = BigDecimal.valueOf(0.01);
        BigDecimal price6 = BigDecimal.valueOf(0.03);
        System.out.println(price5.subtract(price6));



        Short short1 = 1;

    }
}
