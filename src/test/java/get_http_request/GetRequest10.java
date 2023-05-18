package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest10 {

    @Test
    public void test10(){

    String url="http://dummy.restapiexample.com/api/v1/employees";

    Response response=given().when().get(url);

    response.prettyPrint();

    response.then().assertThat()
            .statusCode(200)
            .contentType(ContentType.JSON)
            .body("data[4].employee_name"
            , equalTo("Airi Satou")
            ,"data[5].employee_salary",equalTo(372000));

        JsonPath json=response.jsonPath();

        Assert.assertEquals(200,response.statusCode());

        Assert.assertEquals("Airi Satou",json.getString("data[4].employee_name"));

        Assert.assertEquals(372000, json.getInt("data[5].employee_salary"));

        Assert.assertTrue(json.getList("data.employee_name").contains("Herrod Chandler"));




}
}