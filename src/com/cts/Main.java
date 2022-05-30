package com.cts;

import com.cts.service.SomeService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to session");
		System.out.println("Hope u r able to follow");
	
		SomeService ss=new SomeService(); 
		System.out.println(ss.findLength("program"));
	}

}
