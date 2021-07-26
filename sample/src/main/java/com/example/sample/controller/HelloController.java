package com.example.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sample.bean.Member;

//Controller는 뷰 페이지 리턴 인데 반해서 RestController는 뷰 페이지는 안 되고 문자열이나 JSON 을 그대로 리턴
@Controller
public class HelloController {
	@GetMapping
	@ResponseBody
	public String hello() {

		return "Hello World!";
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}

	@GetMapping("/hello1")
	@ResponseBody
	public String hello1() {
		return "Hello World! hi this is hello1";
	}

	// http://localhost:8000/test1?id=hong&name=홍길동
	@RequestMapping("/test1")
	public String test1(HttpServletRequest httpServletRequest, Model model) {

		String id = httpServletRequest.getParameter("id");
		String name = httpServletRequest.getParameter("name");

		model.addAttribute("id", id);
		model.addAttribute("name", name);

		return "test1";
	}

	// http://localhost:8000/test2?id=hong&name=홍길동

	@RequestMapping("/test2")
	public String test2(@RequestParam("id") String id, @RequestParam("name") String name, Model model) { // 파라미터가 많아지면
																											// 불편해진다.

		model.addAttribute("id", id);
		model.addAttribute("name", name);

		return "test2";
	}

	// http://localhost:8000/test3?id=hong&name=홍길동

	@RequestMapping("/test3")
	public String test3(Member member, Model model) {
		// 파라미터와 일치하는 빈을 만들어서 사용할 수 있다. // View 페이지에서 model 을 사용하지 않고 member를 사용한다.
		return "test3";
	}

	// 패스 자체에 변수를 넣어 줄 수도 있다. 
	//http://localhost:8000/test4/hong/홍길동

	@RequestMapping("/test4/{studentId}/{name}")
	public String getStudent(@PathVariable String studentId, @PathVariable String name, Model model) {
		model.addAttribute("id", studentId);
		model.addAttribute("name", name);
		
		return "test4";
	}

}
