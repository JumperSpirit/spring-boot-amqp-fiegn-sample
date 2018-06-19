package api;

public class FakeRequest {

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
