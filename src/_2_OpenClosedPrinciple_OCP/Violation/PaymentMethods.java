package _2_OpenClosedPrinciple_OCP.Violation;
/*
   Esta classe viola o principio porque case necessite acrescentar
   um novo metodo de pagamento será nexessario alterar a sua estrutura.
 */
public class PaymentMethods {

    public static void pay(String method) {
        switch (method.toUpperCase()) {
            case "CREDIT":
                System.out.println("Pagando com cartao de credito");
                break;
            case "DEBIT":
                System.out.println("Pagando com cartao de debito");
                break;
            default:
                System.out.println("Metodo de pagamento indisponivel");
        }
    }

}
