package DropDown;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.io.FileInputStream;
import java.io.IOException;
public class GetallUsers 
{
	@Test
	public void demo1() throws IOException
	{
		FileInputStream fin=new FileInputStream("D:\\MyWorkSpace\\Assignment\\employee.json");
		given()
		.when()
		.contentType(ContentType.JSON)
		.body(IOUtils.toByteArray(fin))
		.put("http://dummy.restapiexample.com/api/v1/update/21")
		.then()
		.assertThat()
		.and()
		.assertThat().statusCode(200).log().all()
		.and()
		.header("content-length", equalTo("32")).log().all();
	}
}