package com.github.CharlBosch.whitebelt2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
	
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("It is now :"+now);
		
		LocalDateTime tenMinutesFromNow = now.plus(10, ChronoUnit.DAYS);
		
		System.out.println("now did not change, why?, it is Immutable (Will never change): " +now) ;
		System.out.println("Ten minutes from now will be " +tenMinutesFromNow);
		}
	
	}