package com.platzi.javatest.payments;

public interface PaymentGateWay {
    PaymentResponse requestPayment(PaymentRequest request);
}
