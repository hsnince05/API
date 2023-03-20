package get_requests;

import base_urls.SwaggerPetstoreBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.SwaggerPetstoreTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.authentication;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Odev08 extends SwaggerPetstoreBaseUrl {


    @Test
    public void odev08(){
        //Set the URL
        spec.pathParam("first","user");


        //Set the expectedData
        SwaggerPetstoreTestData obj = new SwaggerPetstoreTestData();
        Map<String,Object> expectedData = obj.expectedDataMethod(19955,"hasanince","hasan","ince","fdjshfjdhs","hasan05","5454",54789);
        System.out.println(expectedData);


        // Send the request and get the response
        Response response = given().spec(spec).when().body(expectedData).post("/{first}");
        response.prettyPrint();

        Map<String,Object>actual = response.as(HashMap.class);
        System.out.println("actual = " + actual);

        //Do assertion
        assertEquals(200,response.statusCode());

        spec.pathParams("first","user","second",19955);

        given().spec(spec).when().get("/{first}/{second}");

    }

}
