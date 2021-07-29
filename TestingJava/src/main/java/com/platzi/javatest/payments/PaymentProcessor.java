package com.platzi.javatest.payments;

public class PaymentProcessor {

    private static PaymentGateWay paymentGateWay;

    public PaymentProcessor(PaymentGateWay paymentGateWay) {
        this.paymentGateWay = paymentGateWay;
    }
    public static boolean makePayment(double amount){
        PaymentResponse paymentResponse = paymentGateWay.requestPayment(new PaymentRequest(amount));
        if (paymentResponse.getStatus() == PaymentResponse.PaymentStatus.Ok){
            return true;

        }else{
            return false;

        }
    }
}
