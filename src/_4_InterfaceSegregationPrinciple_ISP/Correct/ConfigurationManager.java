package _4_InterfaceSegregationPrinciple_ISP.Correct;

public interface ConfigurationManager {

    void configureRabbitMQ() throws Exception;
    String configureMSSQL(String bd);
    void initConnection(String connection);
}
