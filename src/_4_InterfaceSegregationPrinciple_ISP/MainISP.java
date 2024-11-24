package _4_InterfaceSegregationPrinciple_ISP;

import _4_InterfaceSegregationPrinciple_ISP.Correct.Configurations;
import _4_InterfaceSegregationPrinciple_ISP.Correct.RabbitMQStarter;
import _4_InterfaceSegregationPrinciple_ISP.Violation.ConfigurationsManager;

public class MainISP {
    public static void main(String[] args) {


        /*
            System.out.println("Violando o principio ISP --");
            RabbitMQManager mqManager = new RabbitMQManager();
            String connection = mqManager.configureMSSQL("MSSQL");
            mqManager.startQueue("FILA_DMD");
            mqManager.initConnection(connection);
            mqManager.configureRabbitMQ();

            Configurations configurations = new Configurations();
            String connect = configurations.configureMSSQL("MSSQL");
            configurations.startQueue("FILA_DMD");
            configurations.initConnection(connect);
            configurations.configureRabbitMQ();
         */

        System.out.println("Maneira correta aplicando o principio --");
        Configurations configurations = new Configurations();
        String connect = configurations.configureMSSQL("MSSQL");
        configurations.initConnection(connect);
        configurations.configureRabbitMQ();

        RabbitMQStarter starter = new RabbitMQStarter();
        starter.startQueue("MQ_FILE");
    }
}
