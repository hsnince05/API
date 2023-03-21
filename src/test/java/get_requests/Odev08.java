package get_requests;

import base_urls.SwaggerPetstoreBaseUrl;
import io.restassured.http.ContentType;
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
    public void post01() {
        spec.pathParam("first", "user");
        Map<String, Object> expectedData = new HashMap<>();//Pojo class ile de payload oluşturabilirsiniz
        expectedData.put("username", "JohnDoe");
        expectedData.put("firstName", "John");
        expectedData.put("lastName", "Doe");
        expectedData.put("email", "john@doe.com");
        expectedData.put("password", "1234");
        expectedData.put("phone", "1234");
        expectedData.put("userStatus", 123);

        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}");
        response.prettyPrint();

        Map<String ,Object> actualData =response.as(HashMap.class);
        assertEquals(200,response.statusCode());
        assertEquals(200,actualData.get("code"));
        assertEquals("unknown",actualData.get("type"));
    }

}
