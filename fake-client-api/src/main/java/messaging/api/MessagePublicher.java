package messaging.api;



import messaging.models.FakeRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagePublicher {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostMapping("/publish")
    public void publishMessage(@RequestBody FakeRequest fakeRequest){
        rabbitTemplate.convertAndSend("sfg-message-queue", fakeRequest);
    }
}
