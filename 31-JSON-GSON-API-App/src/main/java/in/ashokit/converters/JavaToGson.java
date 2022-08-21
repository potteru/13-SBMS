package in.ashokit.converters;

import com.google.gson.Gson;

import in.ashokit.bindings.Person;

public class JavaToGson {
	
	public static void main(String[] args) {
		
		Person p = new Person(101, "aadi", "aadi@gmail.com");
		
		Gson gson = new Gson();
		String json = gson.toJson(p);
		
		System.out.println(json);
	}
}
