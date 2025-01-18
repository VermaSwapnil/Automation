package Files;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class DynamicJson {
	
	@Test(dataProvider="BooksData")
	public void addBook(String isbn, String asile)
	{
		RestAssured.baseURI= "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json").
		body(Payload.addBook(isbn, asile))
		.when().post("Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		
		JsonPath js = ReusableMethods.rawtoJson(response);
		String id = js.getString("ID");
		System.out.println(id);
				
	}
	
	@DataProvider(name= "BooksData")
	public Object[][] getData()
	{
		return new Object [][] {{"nama","1511"},{"swap","9497"},{"tvrm","1507"}};
		
	}
	
	

}
