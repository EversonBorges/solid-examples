package _1_SingleResponsabilityPrinciple_SRP.Violation;
/*
   Esta classe viola o principio porque ela tem duas ou mais atribuiçoes.
 */
public class UserManager {

    public static void saveUser(){
        System.out.println("Salvando o usuário");
    }

    public static void authenticationUser(String password, String user){
        System.out.println("Autenticando o usuário");
    }
}
