package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoRestV2DataPojo {

    private Integer user_id;
    private String title ;
    private String body;


    public GoRestV2DataPojo() {
    }

    public GoRestV2DataPojo(Integer user_id, String title, String body) {
        this.user_id = user_id;
        this.title = title;
        this.body = body;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "GoRestV2DataPojo{" +
                "user_id='" + user_id + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
