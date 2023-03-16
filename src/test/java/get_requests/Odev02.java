package get_requests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Odev02 {
    /*
        Given
            https://reqres.in/api/users/23
        When
            User send a GET Request to the url
        Then
            HTTP Status code should be 404
        And
            Status Line should be HTTP/1.1 404 Not Found
        And
            Server is "cloudflare"
        And
            Response body should be empty
     */

    @Test
    public void odev01() {
        Response response;
        String url = "https://reqres.in/api/users/23";
        try {
            response= given().when().get(url);
            response.then().statusLine("HTTP/1.1 404 Not Found");
        } catch (Exception e) {
            assert e.getMessage().contains("404");
            assert e.getMessage().contains("Not Found");
            //Assert.assertFalse(e.getMessage().contains("TechProEd"));

        }

    }

}
