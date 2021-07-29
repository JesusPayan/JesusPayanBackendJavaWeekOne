package com.platzi.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateWay paymentGateWay;
    PaymentProcessor  paymentProcessor;
    @Before
    public void setup(){
         paymentGateWay = Mockito.mock(PaymentGateWay.class);
         paymentProcessor =  new PaymentProcessor(paymentGateWay);
    }
    @Test
    public void payment_is_correct() {

        Mockito.when(paymentGateWay
                .requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse
                        .PaymentStatus.Ok));
        assertTrue(PaymentProcessor.makePayment(1000));
    }
    @Test
    public void payment_is_error() {

        Mockito.when(paymentGateWay
                .requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse
                        .PaymentStatus.ERROR));
        assertFalse(PaymentProcessor.makePayment(1000));
    }
}