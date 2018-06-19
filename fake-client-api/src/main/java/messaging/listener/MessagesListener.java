package messaging.listener;

import messaging.client.FakeClient;
import messaging.models.FakeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagesListener {

    private static final Logger log = LoggerFactory.getLogger(MessagesListener.class);


    @Autowired
    FakeClient fakeClient;

    @RabbitListener(queues = "sfg-message-queue")
    public void process(FakeRequest fakeRequest){
        fakeClient.fakeCall(fakeRequest);
    }

}
