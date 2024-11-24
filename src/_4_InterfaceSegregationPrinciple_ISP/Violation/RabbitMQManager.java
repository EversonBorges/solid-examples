package _4_InterfaceSegregationPrinciple_ISP.Violation;
/*
   Esta classe viola o principio porque Implementa metodos que
   não fazem parte do contexto.
 */
public class RabbitMQManager implements SystemConfiguration {
    @Override
    public void startQueue(String Queue) {
        System.out.println("Iniciando a fila do Rabbit");
    }

    @Override
    public void configureRabbitMQ()  {
        throw new UnsupportedOperationException("Não deve configurar o Rabbit");
    }

    @Override
    public String configureMSSQL(String bd) {
        throw new UnsupportedOperationException("Não deve configurar o MSSQL");
    }

    @Override
    public void initConnection(String connection) {
        throw new UnsupportedOperationException("Não deve iniciar o MSSQL");
    }
}
