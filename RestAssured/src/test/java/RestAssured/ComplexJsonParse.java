package RestAssured;

import Files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {
	
	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(Payload.CoursePrice());
		
		//Print number of courses
		int count = js.getInt("courses.size()");
		System.out.println(count);
		
		//Print purchase amount
		int totalAmount = js.getInt("dashboard.purchaseAmount");
		System.out.println(totalAmount);
		
		//Print title of first course
		String titleFirstCourse = js.get("courses[0].title");
		System.out.println(titleFirstCourse);
		
		//Print all course titles and their respective prices
		for (int i =0; i<count;i++)
		{
			String courseTitles = js.get("courses["+i+"].title");
			System.out.println(courseTitles);
			System.out.println(js.get("courses["+i+"].price").toString());
			
		}
		
		//Print number of copies sold by RPA course
		System.out.println("Print number of copies sold by RPA course");
		
		for (int i =0; i<count;i++)
		{
			String courseTitles = js.get("courses["+i+"].title");
			if (courseTitles.equalsIgnoreCase("RPA"))
			{
				int copies =js.get("courses["+i+"].copies");
				System.out.println(copies);
				break;
				}
			}
	}

}
