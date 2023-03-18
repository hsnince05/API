package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // karşıdan gelen datalari uyusmama durumunda ignore et dedik.. yani id burada olmadigi icin Post03 de id olmadigi icin
                                            // "ava.lang.RuntimeException: com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "id" (class pojos.JsonPlaceHolderPojo), not marked as ignorable (3 known properties: "title", "completed", "userId"])"
                                            // hatasi verdi
public class JsonPlaceHolderPojo {


    private Integer userId ;
    private String title ;
    private Boolean completed ;

    public JsonPlaceHolderPojo() {
    }

    public JsonPlaceHolderPojo(Integer userId, String title, Boolean completed) {
        this.userId = userId;
        this.title = title;
        this.completed = completed;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "JsonPlaceHolderPojo{" +
                "userId=" + userId +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }
}
