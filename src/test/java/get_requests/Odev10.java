package get_requests;

import base_urls.SwaggerPetstoreBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class Odev10 extends SwaggerPetstoreBaseUrl {

    //1) https://petstore.swagger.io/ dokumanını kullanarak statüsü "available" olan "pet" sayısını bulup 100'den fazla olduğunu assert eden bir otomasyon testi yazınız.
    /*
        Given
            https://petstore.swagger.io/v2/pet/findByStatus?status=available
        When
            Send the request
        Then
            Assert that number of pets whose status is "available" is more than 100
     */

    @Test
    public void odev10(){
        spec.pathParams("first","pet","second","findByStatus").queryParams("status","available");

        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        int availablePetsayisi = response.jsonPath().getList("id").size();
        assertTrue(availablePetsayisi>100);
    }
}
