package _4_InterfaceSegregationPrinciple_ISP.Correct;

public class RabbitMQStarter implements RabbitManager {
    @Override
    public void startQueue(String Queue) {
        System.out.println("Iniciando a fila do Rabbit");
    }
}
