package DropDown;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class VerifyCreatedUser 
{
	@Test
	public void createUser()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek");
		obj.put("password", "passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void createUserwithoutpswrd()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserwithoutun()
	{
		JSONObject obj=new JSONObject();
		obj.put("password", "passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserwithinvalidUN()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek123");
		obj.put("password", "passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserWithInvalidPwd()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek");
		obj.put("password", "passoword123");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserInvalidUnPwd()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek123");
		obj.put("password", "passoword212");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserUnWithSpace()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", " rupeek");
		obj.put("password", "passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserPwdWithSpace()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek");
		obj.put("password", " passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserUnWithBlankSpace()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", " ");
		obj.put("password", "passoword");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserPwdWithBlankSpace()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek");
		obj.put("password", " ");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
	
	@Test
	public void createUserUnEndsWithDot()
	{
		JSONObject obj=new JSONObject();
		obj.put("username", "rupeek.");
		obj.put("password", "password");
		RequestSpecification request = RestAssured.given();
		request.contentType(ContentType.JSON);
		request.body(obj.toJSONString());
		Response response = request.request(Method.POST,"http://13.126.80.194:8080/authenticate");
		String responsebody = response.getBody().asString();
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(), 401);
	}
}