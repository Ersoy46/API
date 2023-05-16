package get_http_request;

import base_url.RegresinBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest07 extends RegresinBaseUrl {

    @Test
    public void test07(){

        spec01.pathParams("parametre1", "api" , "parametre2", "users");

        Response response=given().spec(spec01).when().get("/{parametre1}/{parametre2}");

        response.prettyPrint();

        //SAYFAYA ULAŞILMIYOR 404 HATASIIIII
    }
}
