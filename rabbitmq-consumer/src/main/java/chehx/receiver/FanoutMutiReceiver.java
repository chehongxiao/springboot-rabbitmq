package chehx.receiver;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component

/**
 * 解决多个消费者同时接收一个队列的消息
 */
public class FanoutMutiReceiver {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue,//注意这里不要定义队列名称,系统会随机产生
            exchange = @Exchange(value = "fanoutExchange2",type = ExchangeTypes.FANOUT)
    ))
    public void process(Map testMessage) {
        System.out.println("FanoutReceiverS消费者收到消息  : " +testMessage.toString());
    }

}
