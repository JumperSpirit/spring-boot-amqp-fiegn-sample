package messaging;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableFeignClients
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }


    @Bean
    public Queue queue() {
        return new Queue("sfg-message-queue", true, false, false, null);
    }

}
