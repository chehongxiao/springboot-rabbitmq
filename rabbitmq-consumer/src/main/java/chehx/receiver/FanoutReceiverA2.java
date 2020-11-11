package chehx.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA2 {

    /**
     * 收不到消息
     * @param testMessage
     */
    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverA2消费者收到消息  : " +testMessage.toString());
    }

}
