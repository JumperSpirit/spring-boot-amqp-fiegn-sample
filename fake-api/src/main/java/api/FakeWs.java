package api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeWs {

    private static final Logger log = LoggerFactory.getLogger(FakeWs.class);

    @PostMapping("/fake")
    public void fake(@RequestBody FakeRequest fakeRequest){
        log.info("Reciving ms id : " + fakeRequest.getId());
    }
}
