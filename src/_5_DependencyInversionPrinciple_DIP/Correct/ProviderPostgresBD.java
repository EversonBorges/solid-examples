package _5_DependencyInversionPrinciple_DIP.Correct;

public class ProviderPostgresBD implements ConfigurationManagerBD{

    @Override
    public void provider() {
        System.out.println("Iniciando o Postrges");
    }
}
