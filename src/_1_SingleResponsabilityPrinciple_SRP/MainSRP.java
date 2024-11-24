package _1_SingleResponsabilityPrinciple_SRP;

import _1_SingleResponsabilityPrinciple_SRP.Correct.UserAuthentication;
import _1_SingleResponsabilityPrinciple_SRP.Correct.UserRepository;
import _1_SingleResponsabilityPrinciple_SRP.Violation.UserManager;

public class MainSRP {

    public static void main(String[] args) {

        System.out.println("Violando o principio SRP --");
        UserManager.authenticationUser("User@1234", "User1");
        UserManager.saveUser();

        System.out.println("Maneira correta aplicando o principio --");
        UserAuthentication.authentication("User@1234", "User1");
        UserRepository.save();
    }
}
