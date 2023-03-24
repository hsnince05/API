package get_requests;

import base_urls.GoRestBaseUrl;
import base_urls.ZippoPotamBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.ZippoPotamPojo;
import pojos.ZippoPotamplacesPojo;
import util.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class OdevCanHoca01 extends ZippoPotamBaseUrl {
    /*
     Given
            http://api.zippopotam.us/ES/01001
       When
            Kullanıcı GET Methodu ile Request Gönder
        Then
             Status Code un "200" olduğunu Assert et
        And
            Response body nin bu şekilde olduğunu doğrula
            {
    "post code": "01001",
    "country": "Spain",
    "country abbreviation": "ES",
    "places": [
        {
            "place name": "Vitoria-Gasteiz",
            "longitude": "-2.6667",
            "state": "Pais Vasco",
            "state abbreviation": "PV",
            "latitude": "42.85"
        }
    ]
}
     */

    @Test
    public void odev(){
        spec.pathParams("first","ES","second","01001");
        ZippoPotamplacesPojo places = new ZippoPotamplacesPojo("Vitoria-Gasteiz","-2.6667","Pais Vasco","PV","42.85");
        ZippoPotamPojo expectedData= new ZippoPotamPojo("01001","Spain","ES",places);
        System.out.println("expectedData = " + expectedData);

        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        Map<String,Object> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        assertEquals(200,response.getStatusCode());

        assertEquals(expectedData.getPostCode(),actualData.get("post code"));
        assertEquals(expectedData.getCountry(),actualData.get("country"));
        assertEquals(expectedData.getCountryAbbreviation(),actualData.get("country abbreviation"));
        assertEquals(expectedData.getPlaces().getPlacename(),((Map)actualData.get("places")).get("place name"));



    }
}
