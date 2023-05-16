package get_http_request;

import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.security.PublicKey;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest03 {

    //https://restful-booker.herokuapp.com/booking ' url sine gidelim
    //acceps type'i "aplication/json" olan
    // GET request'i yolladigimda
    //gelen response'un
    //status kodunun 200
    //ve content type'inin "application/json"
    //ve first name "Sally"
    //ve last name "Ericsson"
    //ve checkin date "2018-10-07"
    //ve checkout date "2020-09-30 oldugunu TEST EDİN ??


    @Test
    public void test03(){

      String url="https://restful-booker.herokuapp.com/booking/7";

        Response response=given().when().get(url);

        response.prettyPrint();

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json");


        response
                .then()
                .assertThat()
                .body("firstname", equalTo("Eric"))
                .body("lastname",equalTo("Wilson"))
                .body("bookingdates.checkin",equalTo("2018-12-31"))
                .body("bookingdates.checkout", equalTo("2020-01-15"));

    }
}
