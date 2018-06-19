package messaging.client;


import messaging.models.FakeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.ImmediateAcknowledgeAmqpException;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "fake-api", url = "http://192.168.99.100:8087", fallback = FakeClient.FakeClientFallback.class)
public interface FakeClient {

    @RequestMapping(method = RequestMethod.POST, value = "/fake")
    void fakeCall(FakeRequest fakeRequest);

    @Component
    class FakeClientFallback implements FakeClient {

        private static final Logger log = LoggerFactory.getLogger(FakeClientFallback.class);

        public void fakeCall(FakeRequest fakeRequest) throws ImmediateAcknowledgeAmqpException {
            log.info("retry send message to ws");
            throw new ImmediateAcknowledgeAmqpException("Failed");
        }
    }

}

