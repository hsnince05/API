package get_request;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {
    /*
       1) Postman manuel API testi icin kullanilir
       2) API otomasyonu icin Rest-Assuref Library
       3) Otomasyon kodlarının yazımı icin şu adimlari izliyoruz
            a) Gereksinimleri anlama
            b) Test case yazma ;
                - Test case'i yazmak icin "Gherkin Language" kullaniyoruz
                x) Given: ön kosullar ---> Endpoint,body
                y) When : İşlemler ---> Get, Put, Delete ...
                z) Then: Dönütler ---> Assert
                t) And : Coklu islemlerin ard arda yazılacagı yerlerde kullanilir

            c) Test kodunu yazarken su adimlari izleriz:
                i)    Set the URL
                ii)   Set the expected data
                iii)  Send the request and get the response
                iv)   Do Assertion

     */
    public static void main(String[] args) {
        String url = "https://restful-booker.herokuapp.com/booking/55";

        // Get request nasil yapilir:
        Response response = given().when().get(url);
        response.prettyPrint(); // prettyPrint() methodu response datayi yazdirir.

        //Status Code nasil yazdirilir:
        System.out.println("status Code : " + response.statusCode());

        //Content Type nasil yazdirilir:
        System.out.println("Content Type : " + response.contentType());

        // Status Line nasil yazdirilir :
        System.out.println("Status Line : " + response.statusLine());


        //Header nasil yazdirilir:
        System.out.println(response.header("Connection"));
        System.out.println(response.header("Server"));

        //Headers nasil yazdirilir :
        System.out.println(response.headers());

        //Time nasil yazdirilir
        System.out.println("Time : " + response.getTime());




    }
}
