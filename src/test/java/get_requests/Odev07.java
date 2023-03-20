package get_requests;

import base_urls.RegresBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.RegresTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Odev07 extends RegresBaseUrl {

      /*
        Given
            1) https://reqres.in/api/users
            2) {
                "name": "morpheus",
                "job": "leader"
                }
        When
            I send POST Request to the Url
        Then
            Status code is 201
            And response body should be like {
                                                "name": "morpheus",
                                                "job": "leader",
                                                "id": "496",
                                                "createdAt": "2022-10-04T15:18:56.372Z"
                                              }
     */

    @Test
    public void odev07(){

        //Set the URL
        spec.pathParam("first","users");

        // Set the expected Data
        RegresTestData regresTestData = new RegresTestData();
        Map<String,String> expected = regresTestData.expectedDataMethod("morpheus","leader");
        System.out.println("expected = " + expected);

        //Send the request and get the response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expected).post("{first}");

        response.prettyPrint();

        //Do assertion
        assertEquals(201, response.statusCode());

        Map<String,String> actual = response.as(HashMap.class);
        System.out.println("actual = " + actual);

        assertEquals(expected.get("name"),actual.get("name"));
        assertEquals(expected.get("job"),actual.get("job"));

    }
}
