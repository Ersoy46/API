package get_http_request;

import base_url.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static io.restassured.RestAssured.given;

public class GetRequest16 extends JsonPlaceHolderBaseUrl {

    @Test
    public void test16(){

        spec04.pathParams("bir","todos","iki",7);

        Map<String, Object> expectedData= new HashMap<>();
        expectedData.put("userId",1);
        expectedData.put("id", 7);
        expectedData.put("title","illo expedita consequatur quia in");
        expectedData.put("completed","false");

        System.out.println("expectedData" + expectedData);

        Response response= given().spec(spec04).when().get("/{bir}/{iki}");

        response.prettyPrint();

        Map<String,Object> actualData= response.as(HashMap.class);

        System.out.println("actualData" + actualData);


    }
}
