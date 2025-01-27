package com.erhan.testbase;

import com.erhan.pages.US_01_SignIn_PE;
import com.erhan.pages.US_02_SignUp_PE;

public class US_02_PageInitializer extends US_01_BaseClass {
	

	public static US_01_SignIn_PE signIN;
	public static US_02_SignUp_PE signUP;

	
	public static void initialize()
	
	{
		
		 signIN = new US_01_SignIn_PE();
		 signUP = new US_02_SignUp_PE();

	}
	
	


}
