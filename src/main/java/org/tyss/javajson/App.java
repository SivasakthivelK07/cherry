package org.tyss.javajson;

import org.tyss.javajson.dao.Employee2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ObjectMapper mapper = new ObjectMapper();
		
		Employee2 Employee2 = new Employee2(1, "FN01", "fn01@gmail.com", 25000);
		
		try {
			String json = mapper.writeValueAsString(Employee2);
			System.out.println(json);
			
//			Employee2 Employee = mapper.readValue(json, Employee2.class);
//			System.out.println(Employee);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
