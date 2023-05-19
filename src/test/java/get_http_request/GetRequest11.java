package get_http_request;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest11 {

    String endPoint = "https://www.gmibank.com/api/tp-customers/85694";
    String bearerToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtZW1vIiwiYXV0aCI6IlJPTEVfQ1VTVE9NRVIiLCJleHAiOjE2ODQ0OTc0MDh9.0khaQps-j49VU2zoW9TfHPDZou5HUAm8bodZtiE64JAVp4aj08E3XFD_g_ApcxTOJPOOqXBbxfLYSaPpRjcLWA";

    @Test
    public void test11(){

        Response response=given().header("Authorization", "Bearer " + bearerToken).when().get(endPoint).then().extract().response();

        response.prettyPrint();

    }
}
