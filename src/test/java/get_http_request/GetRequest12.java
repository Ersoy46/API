package get_http_request;

import io.restassured.response.Response;
import org.junit.Test;
import utilities.Authentication;

import static io.restassured.RestAssured.given;

public class GetRequest12  extends Authentication {

    String endPoint = "https://www.gmibank.com/api/tp-customers";

    @Test
    public  void  test12(){

        Response response= given()
                .header("Authorization", "Bearer" + generateToken())
                .when()
                .get(endPoint)
                .then()
                .extract().response();

        response.prettyPeek();
    }
}
