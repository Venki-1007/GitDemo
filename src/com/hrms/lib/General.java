package com.hrms.lib;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class General extends Global  {
	@Test(priority=1)
	public void OpenApplication() {
		System.setProperty("webdriver. gecko. driver",local_path);
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application is opened");
		Reporter.log("Application is opened");
		
		
	}
	
	///@Test(priority=2)
	public void Login () throws Exception  {
		
		driver.findElement(By.name(txt_un)).sendKeys(Login_name);
		driver.findElement(By.name(txt_pw)).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name(btn_submit)).click();
		System.out.println("Login is completed");
		driver.manage().window().maximize();
	}
	//@Test(priority=6)
	public void Logout () throws Exception  {
		driver.findElement(By.linkText(Link_logout)).click();
		System.out.println("Logout is completed");
		 Thread.sleep(3000);
		 	
	}
	//@Test(priority=7)
	public void CloseApplication() {
		driver.close();
		System.out.println("Application is closed ");
	}
	//@Test(priority=3)
	public void EnterFrame() throws Exception  {
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter Frame");
	}
	public void Addbbutton() throws Exception{
		driver.findElement(By.xpath(xpath_add_button)).click();
		Thread.sleep(3000);
		System.out.println("cilcked on the add button");
	}
	//@Test(priority=5)
	public void ExitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Frame Exit");
	
	}
	
	//@Test(priority=4)
	public void AddEmp() {
		driver.findElement(By.name(txt_Lastname)).sendKeys(First_name);
		driver.findElement(By.name(txt_firstname)).sendKeys(Last_name);
		driver.findElement(By.xpath(save_button_xpath)).click();
		
		
	}
	
	
	public void EditEmp() throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr/td[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"btnEditPers\"]")).click();
		driver.findElement(By.name("txtEmpLastName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("ven");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("vensipu");
		Thread.sleep(3000);
		driver.findElement(By.xpath(save_button_xpath)).click();

	}
	
	public void DeleteEmp() throws Exception {
		driver.switchTo().frame("rightMenu");
		Select st = new Select(driver.findElement(By.name("loc_code")));
		st.selectByIndex(1);
		driver.findElement(By.name("loc_name")).sendKeys("2283");
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.name("chkLocID[]")).click();
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		
		
		
				
	}
	@Test (priority=2)
	 public void testRecord03172351824Pm() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1536,721 | ]]
	 
	    driver.get("http://183.82.103.245/nareshit/login.php");
	    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    //driver.findElement(By.name("txtUserName")).clear();
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    // ERROR: Caught exception [unknown command [typeSecret]]
	    driver.findElement(By.xpath("//input[@value = \"Login\"]")).click();
	    driver.findElement(By.xpath("//*[text() = \"Add Employee\"]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | id=rightMenu | ]]
	    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Last Name *\"])]")).click();
	    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Last Name *\"])]")).clear();
	    driver.findElement(By.xpath("//input[@id=string(//label[text() = \"Last Name *\"])]")).sendKeys("sipu");
	    driver.findElement(By.name("txtEmpFirstName")).click();
	    driver.findElement(By.name("txtEmpFirstName")).clear();
	    driver.findElement(By.name("txtEmpFirstName")).sendKeys("skanth");
	    driver.findElement(By.xpath("//input[@title = \"Save\"]")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
	    driver.findElement(By.xpath("//*[text() = \"Logout\"]")).click();
	  }


}

