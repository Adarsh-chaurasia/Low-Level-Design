package DesignPatterns.TemplateMethod;

public class PayToMerchant extends PaymentInterface{
    @Override
    public void checkIdentity() {

        System.out.println("CheckFriend Idnetity");

    }

    @Override
    public void calculateFees() {
        System.out.println("CalculateFees");


    }

    @Override
    public void sendMoneyAmount() {

        System.out.println("MoneyAmount");


    }

    @Override
    public void checkBalance() {
        System.out.println("CheckBalance");


    }
}
