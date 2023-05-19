package get_http_request;

import base_url.GMIBankBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.Authentication;

import static io.restassured.RestAssured.given;

public class GetRequest13 extends GMIBankBaseUrl {


    @Test
    public void  test12(){

        spec03.pathParams("bir", "tp-customers" ,"iki" ,"114351");

        Response response=given().spec(spec03).when()
                .header("Authorization", "Bearer" + generateToken())
                .when().get("/{bir}/{iki}");

        response.prettyPrint();



    }



}
