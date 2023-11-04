package com.practiceRest.RestString.Stringcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practiceRest.RestString.entity.Message;

@RestController 
public class StringReturn {

	@PostMapping("/hello")
	ResponseEntity<String> printString()
	{
		String inputValue="welcome to the First microservice";
		return new ResponseEntity<String>(inputValue, HttpStatus.OK);
	}
	
	@GetMapping("/message")
	ResponseEntity<Message> printMessage(@RequestBody Message message)
	{
		return new ResponseEntity<Message>(message, HttpStatus.OK);	
	}
	
	@PostMapping("/pathmessage/{response}")
	ResponseEntity<String> printMessage1(@PathVariable("response") String responseMessage)
	{
		System.err.println("input received ==="+ responseMessage );
		return new ResponseEntity<>(responseMessage, HttpStatus.OK);	
	//	return new ResponseEntity<Message>(HttpStatus.OK);	
		//return ResponseEntity.ok(responseMessage);
	}
	
}
