package TemplateMethod;

public class Main
{
    public static void main(String[] args){

        PaymentInterface payment = new PayToFriend();
        payment.sendMoneyAmount();
        payment.sendMoney();



    }


}
