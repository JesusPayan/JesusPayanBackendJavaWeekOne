package com.platzi.javatest.discounts;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {
private  static List<Double> prices =  new ArrayList<>();

    public static double getTotal(){
    double result = 0.0;
    for (Double price: prices) {
        result += price;
    }
    return result;
}
    public static void  addPrices(double price){

    }
}
