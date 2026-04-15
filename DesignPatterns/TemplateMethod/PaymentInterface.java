package DesignPatterns.TemplateMethod;

public abstract class PaymentInterface {

    public abstract void checkIdentity();
    public abstract void calculateFees();
    public abstract void sendMoneyAmount();
    public abstract void checkBalance();



    public final void sendMoney()
    {

        checkIdentity();
        calculateFees();
        sendMoneyAmount();
        checkBalance();

    }


}
