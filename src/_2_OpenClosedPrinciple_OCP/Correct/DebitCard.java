package _2_OpenClosedPrinciple_OCP.Correct;

public class DebitCard extends PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Pagando com cartao de debito");
    }
}


