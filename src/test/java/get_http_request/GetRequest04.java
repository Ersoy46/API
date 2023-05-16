package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest04 {

    //https://dummy.restapiexample.com/api/v1/employees url'ine
    //
    @Test
    public void test04(){

       String url = "https://dummy.restapiexample.com/api/v1/employees";

       Response response= given().when().get(url);

       response.prettyPrint();

       response
               .then()
               .assertThat()
               .statusCode(200)
               .contentType(ContentType.JSON);

       response.then().assertThat().body("data", Matchers.hasSize(24)
               ,"data.employee_name",Matchers.hasItem("Ashton Cox")
       ,"data.employee_age", Matchers.hasItems(61, 63, 66));
    }
}
