package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest09 {

    @Test
    public void test09(){

        String url="http://dummy.restapiexample.com/api/v1/employee/12";

        Response response=given().when().get(url);

        response.prettyPrint();

        response.then().assertThat().statusCode(200).contentType(ContentType.JSON);

        response.then().assertThat().body("data.id" , equalTo(12)
        ,"data.employee_name", equalTo("Quinn Flynn")
        ,"data.employee_salary", equalTo(342000)
        ,"data.employee_age",equalTo(22)
        ,"data.profile_image", equalTo(""));

        JsonPath json=response.jsonPath();

        System.out.println(json.getString("data.employee_name"));
        System.out.println(json.getString("data.employee_salary"));
        System.out.println(json.getString("data.employee_age"));
        System.out.println(json.getString("data.profile_image"));


    }
}
