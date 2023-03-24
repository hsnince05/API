package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomationExercisePojo {

    private Integer  responseCode ;
    private AutomationExerciseProductsPojo  products;

    public AutomationExercisePojo() {
    }

    public AutomationExercisePojo(Integer responseCode, AutomationExerciseProductsPojo products) {
        this.responseCode = responseCode;
        this.products = products;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public AutomationExerciseProductsPojo getProducts() {
        return products;
    }

    public void setProducts(AutomationExerciseProductsPojo products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "AutomationExercisePojo{" +
                "responseCode=" + responseCode +
                ", products=" + products +
                '}';
    }
}
