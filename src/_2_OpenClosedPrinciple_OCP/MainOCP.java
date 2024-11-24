package _2_OpenClosedPrinciple_OCP;

import _2_OpenClosedPrinciple_OCP.Correct.CreditCard;
import _2_OpenClosedPrinciple_OCP.Correct.DebitCard;
import _2_OpenClosedPrinciple_OCP.Correct.PaymentMethod;
import _2_OpenClosedPrinciple_OCP.Violation.PaymentMethods;

public class MainOCP {

    public static void main(String[] args) {

        System.out.println("Violando o principio OCP --");
        PaymentMethods.pay("credit");
        System.out.println("Maneira correta aplicando o principio --");
        PaymentMethod credit = new CreditCard();
        credit.pay();
        PaymentMethod debit = new DebitCard();
        debit.pay();
    }
}
