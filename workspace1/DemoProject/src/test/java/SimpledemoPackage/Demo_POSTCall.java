package SimpledemoPackage;

//import org.testng.Assert;
import org.testng.annotations.Test;

//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
//import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

@Test
public class Demo_POSTCall {
	public void Test_PostCall() {
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("name","abcd");
		mapData.put("salary","20000");
		mapData.put("age","25");
		System.out.println(mapData);
	}
	
	
}
