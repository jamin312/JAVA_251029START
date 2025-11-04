package com.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.container.Speaker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor // 모든 args 초기화 
@RequiredArgsConstructor
// Component와 bean 동일?
@Component
public class SamsungTV implements TV {

	// 1. 생성자 주입 방법
//	final Speaker speaker; // 의존관계 객체

	// 2. setter 주입
	@Setter(onMethod_ = {@Autowired})
	
	// 3. 필드 주입
	@Autowired
	Speaker speaker;
	int model;
	
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	@Override
	public void volumeUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}

	// lombok을 사용하기 때문에 아래 방법은 사용 안 함
//	// Speaker 의존관계 생성자
//	public SamsungTV(Speaker speaker) {
//		super();
//		this.speaker = speaker;
//		System.out.println("생성자 방식으로 주입");
//	}
//	
//	// Setter
//	public void setSpeaker(Speaker speaker) {
//		this.speaker = speaker;
//		System.out.println("setter 방식으로 주입");
//	}

//	public SamsungTV() {
//		System.out.println("===> SamsungTV");
//	}

} // end class
