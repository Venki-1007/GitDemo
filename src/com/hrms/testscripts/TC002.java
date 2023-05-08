package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002 {
	public static void main(String[] args) throws Exception {

	
		General gen = new General();
		gen.OpenApplication();
		gen.Login();
		gen.EnterFrame();
		gen.AddEmp();
		gen.ExitFrame();
		gen.Logout();
		gen.CloseApplication();
	}
}
		

	
