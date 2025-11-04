package com.container;

import org.springframework.stereotype.Component;

@Component
public class AppleSpeaker implements Speaker {

	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker volumeUp.");

	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker volumeDown.");

	}

}
