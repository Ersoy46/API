package get_http_request;

import base_url.DummyBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest08 extends DummyBaseUrl {

    //http://dummy.restapiexample.com/api/v1/employees url'sinde bulunan
    //butun çalilanların isimleini konsola yazdiralim
    //3. çalişan kişini ismini konsola yazdır
    //ilk 5 çalışan adinin konsola yazdır
    //en son çalışanin adini konsoa yazdir

    @Test
    public void test08(){

        spec02.pathParams("first", "api" , "second" , "v1" , "third" , "employees");

        Response response=given().spec(spec02).when().get("/{first}/{second}/{third}");

        response.prettyPrint();


        JsonPath json=response.jsonPath();
        System.out.println(json.getString("data.employess_name"));

    }

}
