package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC003  {
public static void main(String[] args) throws Exception  {
	
	General gen = new General ();
		gen.OpenApplication();
		gen.Login();
		
		gen.DeleteEmp();
		gen.Logout();
		gen.CloseApplication();
		
	}
}


