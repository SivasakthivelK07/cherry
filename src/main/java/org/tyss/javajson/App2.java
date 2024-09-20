package org.tyss.javajson;

import org.tyss.javajson.dao.Employee2;
import org.tyss.javajson.dao.JsonToJava;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App2 {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		JsonToJava jsonToJava = new JsonToJava();
		ObjectMapper mapper = new ObjectMapper();

		try {
			Employee2 Employee2 = mapper.readValue(jsonToJava.getName(), Employee2.class);
			System.out.println(Employee2.getEmail());
			System.out.println(Employee2.getName());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
}
