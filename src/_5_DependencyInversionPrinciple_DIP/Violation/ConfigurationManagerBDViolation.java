package _5_DependencyInversionPrinciple_DIP.Violation;

/*
   Esta classe viola o principio porque cria uma dependencia
   de um tipo de banco de dados e não pode ser generalista
 */
public class ConfigurationManagerBDViolation {

    private final ProviderOracleBDViolation provider;

    public ConfigurationManagerBDViolation(){
        this.provider = new ProviderOracleBDViolation();
    }

    public void startBD(){
        provider.providerBD();
    }
}
