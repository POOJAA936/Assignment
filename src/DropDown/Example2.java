package DropDown;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import static io.restassured.RestAssured.*;
import java.io.FileInputStream;
import java.io.IOException;
public class Example2 
{
	@Test
	public void createUser() throws IOException 
	{
		FileInputStream fin=new FileInputStream("D:\\MyWorkSpace\\Assignment\\employee.json");
		given()
		.when()
		.contentType(ContentType.JSON)
		.body(IOUtils.toByteArray(fin))
		.post("http://13.126.80.194:8080/authenticate")
		.then().log().all()
		.assertThat().statusCode(200);
	}
}