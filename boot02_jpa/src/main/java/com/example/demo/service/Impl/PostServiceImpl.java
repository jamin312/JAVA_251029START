package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;

import com.example.demo.repository.PostsRepository;
import com.example.demo.service.PostService;
import com.example.demo.service.PostsSaveRequestDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{

	final PostsRepository postsRepository;
	
	@Override
	public Long save(PostsSaveRequestDto requestDto) {
		return postsRepository.save(requestDto.toEntity()).getId();
	}

}
