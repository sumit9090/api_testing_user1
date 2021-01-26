import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class AddPlace_API {
@Test	
	public void apiTest()
	{
		RestAssured.baseURI="https://rahulshettyacademy.com/";
		Response res=given().queryParam("key", "qaclick123").header("Content-Type","application/json").body(payload.Addapi()).when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.18 (Ubuntu)").contentType(ContentType.JSON).extract().response();
		
		String str = res.asString();
		System.out.println(str);
		JsonPath js = Reusable.rawtoJson(str);
		//JsonPath js=new JsonPath(str);
		 String placeID = js.getString("place_id");
		 System.out.println(placeID);
		 System.out.println("testing");
		
		 
		 //update api
		 String newAddress="70 Summer walk, USA";
		 given().queryParam("key", "qaclick123").header("Content-Type","application/json").body("{\r\n" + 
		 		"\"place_id\":\""+placeID+"\",\r\n" + 
		 		"\"address\":\""+newAddress+"\",\r\n" + 
		 		"\"key\":\"qaclick123\"\r\n" + 
		 		"}\r\n" + 
		 		"").when().put("maps/api/place/update/json").then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated"));
		 
		 //get api
		 
		 String getPlaceResponse = given().queryParam("key", "qaclick123").queryParam("place_id", placeID).when().get("maps/api/place/get/json").then().assertThat().statusCode(200).extract().response().asString();
		 JsonPath js1 = Reusable.rawtoJson(getPlaceResponse);
		// JsonPath js1=new JsonPath(getPlaceResponse);
		 String address = js1.getString("address");
		 System.out.println(address);
		 Assert.assertEquals(address, newAddress);
		 System.out.println("testing");
		
	}

}
