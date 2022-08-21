package in.ashokit.converters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import in.ashokit.bindings.Person;



public class GsonToJava {
	
	public static void main(String[] args) throws Exception, JsonIOException, FileNotFoundException {
		
		Gson gson = new Gson();
		Person fromJson = gson.fromJson(new FileReader(new File("person.json")), Person.class);
		
		System.out.println(fromJson);
	}

}
