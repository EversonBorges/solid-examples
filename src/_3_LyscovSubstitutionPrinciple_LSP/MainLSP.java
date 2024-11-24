package _3_LyscovSubstitutionPrinciple_LSP;

import _3_LyscovSubstitutionPrinciple_LSP.Correct.Bird;
import _3_LyscovSubstitutionPrinciple_LSP.Correct.FlyingBird;
import _3_LyscovSubstitutionPrinciple_LSP.Correct.Penguin;
import _3_LyscovSubstitutionPrinciple_LSP.Violation.BirdViolation;
import _3_LyscovSubstitutionPrinciple_LSP.Violation.PenguinViolation;

public class MainLSP {
    public static void main(String[] args) {

        System.out.println("Maneira correta aplicando o principio --");
        FlyingBird flyingBird =  new FlyingBird();
        flyingBird.move();
        flyingBird.fly();

        Penguin penguin = new Penguin();
        penguin.move();
        penguin.swim();

        System.out.println("Violando o principio ISP --");
        PenguinViolation penguimViolation = new PenguinViolation();
        penguimViolation.fly();


    }
}
