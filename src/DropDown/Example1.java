package DropDown;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Example1 
{
	@Test
	public void getUsers() throws IOException
	{
		FileInputStream fin=new FileInputStream("D:\\MyWorkSpace\\Assignment\\employee.json");
		given()
		.when()
		.contentType(ContentType.JSON)
		.body(IOUtils.toByteArray(fin))
		.post("https://reqres.in/api/users")
		.then().log().all()
		.assertThat().statusCode(201);
	}
}