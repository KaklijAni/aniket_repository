package com.core;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
		try {
			String testJson = "{\"name\":\"Computer\",\"address\":\"Nasik\",\"studentList\":[{\"name\":\"Sahil\",\"Address\":\"Chinchawad\",\"grade\":\"A\"}]}\r\n"
					+ "";	
			Deptlist readValue = mapper.readValue(testJson, Deptlist.class);
			//Map<String, MyObject> userObj = readValue.getUser();
			System.out.println("readValue = " + readValue);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
