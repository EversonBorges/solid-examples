package _4_InterfaceSegregationPrinciple_ISP.Correct;

public class Configurations implements ConfigurationManager {

    @Override
    public void configureRabbitMQ()  {
        System.out.println("Configurando o Rabbit");
    }

    @Override
    public String configureMSSQL(String bd) {
        System.out.println("Configurando o MSSQL");
        return bd;
    }

    @Override
    public void initConnection(String connection) {
        System.out.println("Iniciando o MSSQL");
    }
}
