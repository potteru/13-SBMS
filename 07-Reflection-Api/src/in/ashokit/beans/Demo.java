package in.ashokit.beans;

import java.lang.reflect.Field;

public class Demo {
	
	public static void main(String[] args){
		try {
			//loading the class using forName()
			Class<?> clazz = Class.forName("in.ashokit.beans.User");
			
			//Creating object for the class which is loaded
			Object object = clazz.newInstance();
			
			//loading the variable which is declared the class
			Field ageField = clazz.getDeclaredField("age");
			
			//making the variable as access
			ageField.setAccessible(true);
			
			//setting the value for the variable 
			ageField.set(object, 20);
			
			//Getting the value of the variable and printing on console
			System.out.println(ageField.get(object));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
