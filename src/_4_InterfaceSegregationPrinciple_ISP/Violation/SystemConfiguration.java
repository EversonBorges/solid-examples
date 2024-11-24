package _4_InterfaceSegregationPrinciple_ISP.Violation;

public interface SystemConfiguration {

    void startQueue(String Queue);
    void configureRabbitMQ() throws Exception;
    String configureMSSQL(String bd);
    void initConnection(String connection);
}
