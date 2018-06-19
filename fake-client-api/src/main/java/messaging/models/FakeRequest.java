package messaging.models;

import java.io.Serializable;

public class FakeRequest implements Serializable {

    private Integer id;
    private String message;

    public FakeRequest() {
    }

    public FakeRequest(Integer id, String message) {
        this.id = id;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

}
