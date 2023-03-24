package get_requests;

import base_urls.GoRestBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.GoRestV2DataPojo;
import util.ObjectMapperUtils;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class OdevCanHoca03 extends GoRestBaseUrl {
    /*
        Given
           https://gorest.co.in/public/v2/posts/174
       When
            Kullanıcı GET Methodu ile Request Gönder
        Then
             Status Code un "200" olduğunu Assert et
        And
            Response body nin bu şekilde olduğunu doğrula
 {
    "id": 174,
    "user_id": 612,
    "title": "Tertius valeo sint est vesica doloribus rerum casus cetera nisi sapiente vigor pecus voluptas asperiores et sto vapulus.",
    "body": "Et demens tergo. Cohors copia adeptio. Cotidie speciosus coaegresco. Concido crastinus degero. Tristis fugit supellex. Sustineo cogo odit. Pel patria crur. Amplus comitatus modi. Ater omnis solutio. Voluptatem acies unde. Taceo delinquo ustilo. Alo possimus vaco. Sit cognomen thesaurus. Appositus vel amicitia. Cetera textus defungo."


     */

    @Test
    public void odev(){
        spec.pathParams("first","posts","second",174);

        GoRestV2DataPojo expectedData = new GoRestV2DataPojo(612,
                "Tertius valeo sint est vesica doloribus rerum casus cetera nisi sapiente vigor pecus voluptas asperiores et sto vapulus.",
                "Et demens tergo. Cohors copia adeptio. Cotidie speciosus coaegresco. Concido crastinus degero. Tristis fugit supellex. Sustineo cogo odit. Pel patria crur. Amplus comitatus modi. Ater omnis solutio. Voluptatem acies unde. Taceo delinquo ustilo. Alo possimus vaco. Sit cognomen thesaurus. Appositus vel amicitia. Cetera textus defungo.");

        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        GoRestV2DataPojo actualData = ObjectMapperUtils.convertJsonToJava(response.asString(),GoRestV2DataPojo.class);
        System.out.println("actualData = " + actualData);

        assertEquals(expectedData.getUser_id(),actualData.getUser_id());
        assertEquals(expectedData.getTitle(),actualData.getTitle());
        assertEquals(expectedData.getBody(),actualData.getBody());
    }
}
