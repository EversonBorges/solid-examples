package _5_DependencyInversionPrinciple_DIP.Correct;

public class ProviderBD {

    private final ConfigurationManagerBD managerBD;

    public ProviderBD(ConfigurationManagerBD managerBD){
        this.managerBD = managerBD;
    }

    public void startBD(){
        managerBD.provider();
        System.out.println("Banco iniciado");
    }
}
