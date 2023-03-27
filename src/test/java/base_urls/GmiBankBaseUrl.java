package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static util.AuthenticationGmiBank.generateToken;

public class GmiBankBaseUrl {

    protected RequestSpecification spec ;

    @Before//Her test methodundan önce çalışır.
    public void setUp() {
        spec = new RequestSpecBuilder().
                setContentType(ContentType.JSON).
                addHeader("Authorization", "Bearer " + generateToken()).
                setBaseUri("https://www.gmibank.com").
                build();

    }

}
