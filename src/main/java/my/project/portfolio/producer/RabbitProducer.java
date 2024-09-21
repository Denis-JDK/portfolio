package my.project.portfolio.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
@EnableScheduling
public class RabbitProducer {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Scheduled(fixedDelay = 5000)
    public void sendMessage() {
        int count = 1;
        count++;
        rabbitTemplate.convertAndSend("portfolioExchange","testRoutingKey", count);
    }

}
