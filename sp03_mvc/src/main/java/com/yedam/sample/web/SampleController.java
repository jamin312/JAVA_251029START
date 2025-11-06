package com.yedam.sample.web;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Controller
@RequestMapping("/sample/*")
public class SampleController {

	// 빈 문자열이면 추가 경로 없음 = 클래스 매핑 그대로. /sample
	// RequestMapping => method 여러 개 실행 가능
	@RequestMapping(value = {"insert", "/"}, method = { RequestMethod.POST, RequestMethod.GET })
	public void basic() {
		// Log4j2 어노테이션
		log.info("basic..."); // syso 대신
	}
	
	@GetMapping("/ex01") // ex01?name=aaa&age=20	// 페이징
	public String ex01(@ModelAttribute("sample") SampleDTO sample, RedirectAttributes rda) {
		log.info("sampleDTO: " + sample);
		rda.addFlashAttribute("msg", "가입축하"); // addFlashAttribute 휘발성
		rda.addAttribute("name", sample.getName());
		rda.addAttribute("date", new Date());
		// redirect 없으면 forward
		// redirect 뒤에는 매핑 url을 적어줌
		// forward 뒤에는 페이지명
		// return "redirect:/success"  => 절대경로 : /success
		return "redirect:success";  // => 상대경로 : /sample/success
		
	}
	
	@GetMapping("/success")
	public String success() {
		return "/success";
	}
	
	// int는 null 불가, Integer는 null 가능
	// ex02?name=aaa&age=20	// 페이징
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name,
						@RequestParam(value = "birth") Date birth,
						@RequestParam(value = "age",
									  required = false,
									  defaultValue = "10") int age) {
		log.info(name + " : " + age + " : " + birth);
		return "ex02";
	}
	
	@GetMapping("/ex02Array")	// ex02Array?ids=3&ids=4&ids=10 // 체크박스
	public void ex02Array(@RequestParam("ids") List<String> ids) {
		log.info("ids: " + ids);
	}
	
	@GetMapping("/ex03")
	public ModelAndView ex03() {
		ModelAndView mv = new ModelAndView("/hello", "greet", "hi");
//		mv.setViewName("/hello");
//		mv.addObject("greet","hi");
		return mv;
	}
} // end class
