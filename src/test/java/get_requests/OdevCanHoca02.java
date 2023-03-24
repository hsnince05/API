package get_requests;

import base_urls.Covid19ApiBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.Covid19ApiPojo;
import util.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class OdevCanHoca02 extends Covid19ApiBaseUrl {

    /*
    Given
    https://api.covid19api.com/world/total
    When
    Kullanıcı GET Methodu ile Request Gönder
    Then
    Status Code un "200" olduğunu Assert et
            And
    Response body nin bu şekilde olduğunu doğrula
    {
        "TotalConfirmed": 674300771,
            "TotalDeaths": 6793224,
            "TotalRecovered": 0
    }
     */

    @Test
    public void odev(){
        //Set the URL
        spec.pathParams("first","world","second","total");

        // Set the expected Data
        Covid19ApiPojo expectedData = new Covid19ApiPojo(674300771,6793224,0);
        System.out.println("expectedData = " + expectedData);

        //Send the request Get the response
        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        //Do assertion
        Map<String,Object> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200,response.statusCode());
        assertEquals(expectedData.getTotalConfirmed(),actualData.get("TotalConfirmed"));
        assertEquals(expectedData.getTotalDeaths(),actualData.get("TotalDeaths"));
        assertEquals(expectedData.getTotalRecovered(),actualData.get("TotalRecovered"));



    }
}
