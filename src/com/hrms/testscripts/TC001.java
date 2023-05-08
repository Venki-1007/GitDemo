package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001 {

	public static void main(String[] args) throws Exception {

		General gen = new General();
		gen.OpenApplication();
		gen.Login();
		
		gen.Logout();
		gen.CloseApplication();
	}
	
	
	

}
