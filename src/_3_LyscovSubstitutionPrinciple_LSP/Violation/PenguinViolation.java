package _3_LyscovSubstitutionPrinciple_LSP.Violation;

/*
   Esta classe viola o principio porque Implementa
   um metodo que não é compativel com sua atribuição
 */
public class PenguinViolation extends BirdViolation {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Pinguins não voam!");
    }
}
