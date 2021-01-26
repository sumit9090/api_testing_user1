import io.restassured.path.json.JsonPath;


public class Reusable {
	
	public static JsonPath rawtoJson(String response)
	{
		System.out.println("testing");
		System.out.println("testing123");
		System.out.println("test");
		JsonPath js=new JsonPath(response);
		return js;
		
	}

}
