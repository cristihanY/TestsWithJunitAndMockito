package org.example.discounts;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PriceCalculatorTest {

 @Test
 public void total_zero_when_there_are_prices() {
     PriceCalculator calculator = new PriceCalculator();
     assertThat( calculator.getTotal(), is(0.0));
 }

    @Test
    public void total_is_the_som_of_prices() {
        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(10.3);
        calculator.addPrice(15.3);
        calculator.addPrice(10.5);
        assertThat( calculator.getTotal(), is(36.1));
    }

    @Test
    public  void  apply_discount_to_prices(){

        PriceCalculator calculator = new PriceCalculator();
        calculator.addPrice(13.2);
        calculator.addPrice(17.3);
        calculator.addPrice(19.5);

        calculator.setDiscount(75);
        assertThat( calculator.getTotal(), is(12.5));

    }
}