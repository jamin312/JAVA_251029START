package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.PostService;
import com.example.demo.service.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class PostApiController {
	
	// postServiceImpl 인젝션 주입
	final PostService postService;
	
	@PostMapping("/api/v1/posts")
	public Long save(@RequestBody PostsSaveRequestDto requestDto) {
		return postService.save(requestDto);
	}
	
//	@GetMapping("/posts")
//	public ModelAndView posts() {
//		return new ModelAndView("posts");
//	}

	
	
}
