package com.platzi.javatest.discounts;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class PriceCalculatorTest {
    PriceCalculator priceCalculator =  new PriceCalculator();
    @Test
    public void total_zero_if_there_is_not_prices(){
        assertThat(priceCalculator.getTotal(), is (0));
    }
    @Test
    public void total_is_the_sum_of_price(){
        priceCalculator.addPrices(10.5);
        priceCalculator.addPrices(28.5);

        assertThat(priceCalculator,is(25.7));

    }
    @Test
    public void apply_discount_to_price(){
        priceCalculator.addPrices(12.5);
        priceCalculator.addPrices(17.5);
        assertThat(priceCalculator.getTotal(), is(0.0));
    }


}