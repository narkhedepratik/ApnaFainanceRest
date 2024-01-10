package com.health.main.utility;

import java.util.Random;

public class PasswordGenrator {

	private static final Random passwordReandom=new Random();
	
	public static String getPassword(String employeeName)
	{
		return employeeName+passwordReandom.nextInt(111, 999);
	}
	
	
}
