package _2_OpenClosedPrinciple_OCP.Correct;

public class CreditCard extends PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Pagando com cartao de credito");
    }
}
