package DropDown;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetallUsers 
{
	@Test
	public void demo1()
	{
		given()
		.when()
		.get("http://dummy.restapiexample.com/api/v1/employees")
		.then()
		.assertThat()
		.and()
		.assertThat().statusCode(200)
		.and()
		.body("data", hasSize(25))
		.header("content-length", equalTo("595"));
	}
}