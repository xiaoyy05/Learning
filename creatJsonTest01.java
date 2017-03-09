import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class creatJsonTest01 {

	public static void main(String[] args) {
		
		JsonObject object = new JsonObject();
		object.addProperty("cat", "it");
		
		JsonArray array = new JsonArray();
		JsonObject element1 = new JsonObject();
		element1.addProperty("id", 1);
		element1.addProperty("ide", "Eclipse");
		element1.addProperty("name", "Java");
		array.add(element1);
		
		JsonObject element2 = new JsonObject();
		element2.addProperty("id", 2);
		element2.addProperty("ide", "Xcode");
		element2.addProperty("name", "Swift");
		array.add(element2);
		
		JsonObject element3 = new JsonObject();
		element3.addProperty("id", 3);
		element3.addProperty("ide", "Visual Studio");
		element3.addProperty("name", "C#");
		array.add(element3);
		
		object.add("languages", array);
		
		object.addProperty("pop", true);
		
		System.out.println(object.toString());
	}

}
