package chehx.receiver;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

public class FanoutMutiReceiver2 {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,
            exchange = @Exchange(value = "fanoutExchange2",type = ExchangeTypes.FANOUT)
    ))
    public void process(Map testMessage) {
        System.out.println("FanoutReceiver2消费者收到消息  : " +testMessage.toString());
    }

}
