package DropDown;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class PaytmApp 
{
	@Test
	public void getAllEmployees()
	{
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		JSONObject obj=new JSONObject();
		obj.put("name", "Pooja");
		obj.put("salary", "30000");
		obj.put("age", "26");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toString());
		Response response = request.get();
		String res = response.asString();
		System.out.println(res);
	}
}