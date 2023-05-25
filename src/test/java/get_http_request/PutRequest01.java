package get_http_request;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutRequest01 {

    @Test
    public JSONObject test01(){

        JSONObject expectedRequest=new JSONObject();
        expectedRequest.put("userId",21);
        expectedRequest.put( "title","Wash the dishes");
        expectedRequest.put("completed",false);
        return expectedRequest;

    }
    @Test
    public void test02(){
        String url="https://jsonplaceholder.typicode.com/todos/198";

        Response response= given().when().get(url);


    }
}
