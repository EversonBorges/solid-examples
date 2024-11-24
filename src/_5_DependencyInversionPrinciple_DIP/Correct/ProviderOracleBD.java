package _5_DependencyInversionPrinciple_DIP.Correct;

public class ProviderOracleBD implements ConfigurationManagerBD {

    @Override
    public void provider() {
        System.out.println("Iniciando o Oracle");
    }
}
