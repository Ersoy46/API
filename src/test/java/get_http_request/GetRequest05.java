package get_http_request;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest05 {

    @Test
    public void test05(){
        String url ="https://jsonplaceholder.typicode.com/todos/123";

       Response response=given().when().get(url);

       response.prettyPrint();

       response
               .then()
               .assertThat()
               .statusCode(200)
               .contentType(ContentType.JSON)
               .header("Server", Matchers.equalTo("cloudflare"))
               .header("alt-svc", Matchers.equalTo("h3=\":443\"; ma=86400, h3-29=\":443\"; ma=86400"))
               .body("userId", Matchers.equalTo(7),"title"
                       ,Matchers.equalTo("esse et quis iste est earum aut impedit")
                       ,"completed",Matchers.equalTo(false)) ;




    }


}
