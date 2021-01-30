import io.restassured.path.json.JsonPath;


public class Reusable {
	
	public static JsonPath rawtoJson(String response)
	{
		System.out.println("testing");
		
		System.out.println("testingxyz");
		

		System.out.println("testing123");

		System.out.println("test");
		System.out.println("made more changes");
		System.out.println("made changes again");
		JsonPath js=new JsonPath(response);
		return js;
		
	}

}
