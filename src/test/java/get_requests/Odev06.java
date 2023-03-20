package get_requests;

import base_urls.RegresBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Odev06 extends RegresBaseUrl {

      /*
       Given
              https://reqres.in/api/unknown/
       When
            I send GET Request to the URL
       Then

            1)Status code is 200
            2)Print all pantone_values
              (Tüm pantone_value değerlerini yazdırınız)
            3)Print all ids greater than 3 on the console
              (3'ten büyük id'leri yazdırınız)
              Assert that there are 3 ids greater than 3
              (3'ten büyük 3 adet id olduğunu doğrulayınız)
            4)Print all names whose ids are less than 3 on the console
              (id'si 3'ten küçük isimleri yazdırınız)
              Assert that the number of names whose ids are less than 3 is 2
              (id'si 3'ten küçük 2 isim olduğunu doğrulayınız)
    */

    @Test
    public void odev06(){
        //Set the URL
        spec.pathParam("first","unknown");

        // Set the expected Data

        // send the request and get the response
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        // Do assertion
        assertEquals(200,response.statusCode());

//        //(Tüm pantone_value değerlerini yazdırınız)
//        JsonPath jsonPath = response.jsonPath();
//        List<String>pantone_values = jsonPath.getList("data.findAll{it.pantone_value}.pantone_value");
//        System.out.println("pantone_values = " + pantone_values);
//
//        //(3'ten büyük id'leri yazdırınız)
//        List<Integer> ids = jsonPath.getList("data.findAll{it.id>3}.id");
//        System.out.println("ids = " + ids);
//        //(3'ten büyük 3 adet id olduğunu doğrulayınız)
//        assertEquals(3,ids.size());



//        //              (id'si 3'ten küçük isimleri yazdırınız)
//        List<String> name = jsonPath.getList("data.findAll{it.id<3}.name");
//        System.out.println("name = " + name);
//        //              (id'si 3'ten küçük 2 isim olduğunu doğrulayınız)
//        assertEquals(2,name.size());


        // İkinci yol
        JsonPath jsonPath = response.jsonPath();
        List<String>pantone_values = jsonPath.getList("data.pantone_value");
        System.out.println("pantone_values = " + pantone_values);

        //(3'ten büyük id'leri yazdırınız)
        List<Integer> ids = jsonPath.getList("data.id");
        System.out.println("ids = " + ids);
        int counter = 0;
        for (int w : ids){
            if(w>3){
                System.out.print(w);
                counter ++;
            }
        }
        System.out.println();
        System.out.println(counter);
        //(3'ten büyük 3 adet id olduğunu doğrulayınız)
        assertEquals(3,counter);
//
//



//
//        //              (id'si 3'ten küçük isimleri yazdırınız)
        List<Integer> ids2 = jsonPath.getList("data.id");
        System.out.println("ids = " + ids);
        int counter2 = 0;
        for (int w : ids){
            if(w<3){
                System.out.print(w);
                counter2 ++;
            }
        }
        System.out.println();
        System.out.println(counter2);
//        //              (id'si 3'ten küçük 2 isim olduğunu doğrulayınız)
        assertEquals(2,counter2);



    }
}
