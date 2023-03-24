package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutomationExerciseProductsPojo {
    private Integer id;
    private String name;
    private String price ;
    private String brand;
    private AutomationExerciseCategoryPojo category ;

    public AutomationExerciseProductsPojo() {
    }

    public AutomationExerciseProductsPojo(Integer id, String name, String price, String brand, AutomationExerciseCategoryPojo category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public AutomationExerciseCategoryPojo getCategory() {
        return category;
    }

    public void setCategory(AutomationExerciseCategoryPojo category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "AutomationExerciseProductsPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", brand='" + brand + '\'' +
                ", category=" + category +
                '}';
    }
}
