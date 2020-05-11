package SimpledemoPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Test_getCall {
	@Test
	void test_01() {
		Response res=get("http://dummy.restapiexample.com/api/v1/employees");
		System.out.println("response Body:"+"/n"+res.getBody().asString());
		System.out.println("response info:"+res.getStatusCode());
		Assert.assertEquals(res.getStatusCode(),200);
		System.out.println("Employee_name:"+res.getBody());
		
		
	}
	@Test
	void test_02() {
		given().get("http://dummy.restapiexample.com/api/v1/employees").then().statusCode(200);
		String value=given().get("http://dummy.restapiexample.com/api/v1/employees").getBody().prettyPrint();
		System.out.println(value);
		given().get("http://dummy.restapiexample.com/api/v1/employees").then().body("data[0].employee_name", equalToIgnoringCase("Tiger Nixon"));

	}

}
