package RestAssured;

import io.restassured.RestAssured;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import Files.Payload;
import Files.ReusableMethods;

public class Basics {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Add place--> Update place with new address-->get place to validate new address is present in response
		
		RestAssured.baseURI=("https://rahulshettyacademy.com");
		
		//Addplace
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		//.body(Payload.addPlace()).when().post("maps/api/place/add/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Dell\\Documents\\Selenium\\API&Postman\\Document\\AddPlace.json"))))
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)")
		.extract().response().asString();
		
		System.out.println(response);
		JsonPath js = new JsonPath(response); //for parcing
		String placeId = js.getString("place_id");
		System.out.println(placeId);
		
		//UpdatePlace
		String newAddress ="70 winter walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated") );
		
		//GetPlace
		String getPlaceResponse = given().log().all().queryParam("key","qaclick123")
		.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200)
		.extract().response().asString();
		
		 JsonPath js1 = ReusableMethods.rawtoJson(getPlaceResponse);
		String actualaddress = js1.getString("address");
		System.out.println(actualaddress);
		
		Assert.assertEquals(actualaddress,newAddress );
		
		
		
	}

}
