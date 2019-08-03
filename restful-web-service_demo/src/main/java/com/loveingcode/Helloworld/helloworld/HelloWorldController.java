package com.loveingcode.Helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Tell spring MVC that this is a controller 
@RestController
public class HelloWorldController { 
	//method
		//GET
		//URI
		//@RequestMapping(method=RequestMethod.GET,path = "/hello-world")
		@GetMapping(path = "/hello-world")
		public String Helloworld()
		{
			return "Hello-world";
		}
		
		@GetMapping(path = "/hello-world-internalization")
		public String Helloworldinternalization()
		{
			return "Hello-world-internalization";
		}
		
		@GetMapping(path =  "/hello-world-bean")
		public HelloworldBean HelloworldBean()
		{
			return new HelloworldBean("Hello-world-bean");
		} 
		//"hello-world/path-variable/luv2code"
		@GetMapping(path = "/hello-world/path-variable/{name}")
		public HelloworldBean HelloworldPathVariable(@PathVariable String name)
		{
			return new HelloworldBean(String.format("Hello-world-bean, %s", name));
		}
		
}
