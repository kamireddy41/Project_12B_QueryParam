package com.telusko.QueryParam.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController 
{
	//http://localhost:8080/info?name=paras  ?key=value
	@GetMapping("/info")
	public String getSomeInfo(@RequestParam("name")String n,Map<String, Object> map)
	{
		System.out.println(n);
		map.put("name", "Hello "+ n + " I hope you're fine and this is Query param ex");
		return "index";
	}
	//http://localhost:8080/info?name=paras&course=SpringBoot  ?key=value&key=value

	@GetMapping("/info2")
	public String getSomeInfo2(@RequestParam("name")String n,String course, Map<String, Object> map)
	{
		System.out.println(n);
		map.put("name", "Hello "+ n + " I hope you're enjoying "+course+ " every weekend");
		return "index";
	}

}
