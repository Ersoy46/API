package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest06 {

    @Test
    public void test06(){

       String url= "https://restful-booker.herokuapp.com/booking/5";

       Response response=given().when().get(url);

       response.prettyPrint();

       response
               .then()
               .assertThat()
               .statusCode(200)
               .contentType(ContentType.JSON)
               .body("firstname", equalTo("Mark"))
               .body("totalprice", equalTo(212))
               .body("bookingdates.checkin", equalTo("2023-02-09"))
               .body("bookingdates.checkout", equalTo("2023-03-20"));


    }
}
