package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomationExerciseCategoryPojo {

    private AutomationExerciseUserTypePojo usertype ;
    private String category;

    public AutomationExerciseCategoryPojo() {
    }

    public AutomationExerciseCategoryPojo(AutomationExerciseUserTypePojo usertype, String category) {
        this.usertype = usertype;
        this.category = category;
    }

    public AutomationExerciseUserTypePojo getUsertype() {
        return usertype;
    }

    public void setUsertype(AutomationExerciseUserTypePojo usertype) {
        this.usertype = usertype;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "AutomationExerciseCategoryPojo{" +
                "usertype=" + usertype +
                ", category='" + category + '\'' +
                '}';
    }
}
