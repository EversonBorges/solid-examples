package _4_InterfaceSegregationPrinciple_ISP.Violation;

/*
   Esta classe viola o principio porque Implementa metodos que
   não fazem parte do contexto.
 */
public class ConfigurationsManager implements SystemConfiguration {

    @Override
    public void startQueue(String Queue) {
        throw new UnsupportedOperationException("Iniciando a fila do Rabbit");
    }

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
        System.out.println("Iniciando o " + connection);
    }
}
