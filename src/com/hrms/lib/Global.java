package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	public String local_path = "F:\\Selenium_Automation\\driver folder";
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String Login_name = "nareshit";
	public String password = "nareshit";
	public String First_name = "Venki";
	public String Last_name ="Selinum";
	
	/****objects***/
	public String txt_un = "txtUserName";
	public String txt_pw = "txtPassword";
	public String btn_submit = "Submit";
	public String Link_logout = "Logout";
	public String txt_firstname = "txtEmpFirstName";
	public String txt_Lastname ="txtEmpLastName";
	public String save_button_xpath = "//*[@id=\"btnEdit\"]";
	public String xpath_add_button = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	
	

}