import io.restassured.path.json.JsonPath;


public class ComplexjsonParse {
	
	public static void main(String args[])
	{
		//number of courses
		JsonPath js=new JsonPath(payload.CourseAPI());
		 int courses_count = js.getInt("courses.size()");
		 System.out.println(courses_count);
		 //purshase amount
		 
		 int purshase_amount=js.getInt("dashboard.purchaseAmount");
		 System.out.println(purshase_amount);
		 
		 //title of 1st course
		 
		 String firstcourse_title = js.getString("courses[0].title");
		 System.out.println(firstcourse_title);
		 //get all the course title
		 
		 for(int i=0;i<courses_count;i++)
		 {
			String eachcourse_title=js.getString("courses["+i+"].title");
			System.out.println(eachcourse_title);
			
			int eachcourse_price=js.getInt("courses["+i+"].price");
			System.out.println(eachcourse_price);
			 System.out.println("testing");
			 System.out.println("testing");
		 }
		 
		 
		 for(int i=0;i<courses_count;i++)
		 {
		 String eachcourse_title=js.getString("courses["+i+"].title");
		 
		 if(eachcourse_title.equals("RPA"))
		 {
			 int RPA_Copies=js.getInt("courses["+i+"].copies");
			 System.out.println("RPA COPIES ARE "+RPA_Copies);
			 break;
			 
		 }
		 
	}
		 
		 
	}
	
	
}
