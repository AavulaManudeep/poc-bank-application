package RabbitMQ;

import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import java.util.concurrent.CompletionStage;

@ApplicationScoped
@Slf4j
public class RabbitMQMessageConsumer {

    @Incoming("test_channel")
    public CompletionStage<Void> consume(Message<String>  message) {
        log.info("In the consumer");
        return message.ack();
    }
}
