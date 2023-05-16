package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class DummyBaseUrl {
    protected RequestSpecification spec02;

    @Before
    public void setUp(){
        spec02=new RequestSpecBuilder().setBaseUri("https://dummy.restapiexapmle.com").build();



    }

}
