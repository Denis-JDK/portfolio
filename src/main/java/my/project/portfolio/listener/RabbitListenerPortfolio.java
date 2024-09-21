package my.project.portfolio.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitListenerPortfolio {
    @RabbitListener(queues = "rabbitQueuesFirst")
    public void list(String text) {
        System.out.println("Сообщение из очереди: " + text);
    }
}
