package Context;

import Strategy.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void executePayment(){
        this.strategy.executePayment();
    }
}
