package tests;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends InitTest {
	Login logPage;
	
//	Empty Email and empty pass input, click on Login 
	
    @Test(priority=0) 
     public void LoginPage1() {
  
	  logPage = new Login(driver);
	  driver.get("http://app.invoice-factory.source-code.rs");
		assertTrue(logPage.isEmail()); 
		assertTrue(logPage.isPass());
		assertTrue(logPage.isAt());
		
		logPage.fillData("", "");
		logPage.logIn();
		
	
		assertTrue(logPage.isEmailErrorPresent());
		assertTrue(logPage.isPassErrorPresent());
	}
  
//	Invalid Email, invalid password, click on Login
    
	@Test(priority=1)
	  public void LoginPage2() {
		  
		  logPage = new Login(driver);
		  driver.get("http://app.invoice-factory.source-code.rs");
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmailcom", "qwe");
			logPage.logIn();
						
			assertTrue(logPage.isEmailErrorPresent());
			assertTrue(logPage.isPassErrorPresent());
		}
	
//	Invalid Email, valid password, click on Login
	
	@Test(priority=2)
	  public void LoginPage3() {
		  
		  logPage = new Login(driver);
		  driver.get("http://app.invoice-factory.source-code.rs");
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmailcom", "qwe123");
			logPage.logIn();
			
			assertTrue(logPage.isEmailErrorPresent());
		}
	
//	Valid Email, invalid password, click on Login
	
	@Test(priority=3)
	  public void LoginPage4() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmail.com", "q123");
			logPage.logIn();
			
			assertTrue(logPage.isPassErrorPresent());
		}
	
//	Invalid Email, empty password , click on Login
	
	@Test(priority=4)
	  public void LoginPage5() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993gmail.com", "");
			logPage.logIn();
			
			assertTrue(logPage.isEmailErrorPresent());
			assertTrue(logPage.isPassErrorPresent());

		}
	
//	Empty Email, valid password, click on Login
	
	@Test(priority=5)
	  public void LoginPage6() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("", "qwe122");
			logPage.logIn();			

			assertTrue(logPage.isEmailErrorPresent());
		}
	
//	Incorrect Email , incorrect password , click on Login
	
	@Test(priority=6)
	  public void LoginPage7() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			
			logPage.fillData("goranpopovic993@gmail.com", "qwe122");
			logPage.logIn();
			
			logPage.invalidCredDisplayed();
			
			assertTrue(logPage.invalidCredDisplayed());
		}
	
//	Correct Email, incorrect password , click on Login
	
	@Test(priority=7)
	  public void LoginPage8() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmail.com", "qww122");
			logPage.logIn();
			
			logPage.invalidCredDisplayed();
			
			assertTrue(logPage.invalidCredDisplayed());
		}
	
//	Incorrect Email, correct password, click on Login
	
	@Test(priority=8)
	  public void LoginPage9() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goraopovic1993@gmail.com", "qwe123");
			logPage.logIn();
			
			logPage.invalidCredDisplayed();
			
			assertTrue(logPage.invalidCredDisplayed());
		}
	
//	Correct Email without @, correct password, click on Login
	
	@Test(priority=9)
	  public void LoginPage10() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993gmail.com", "qwe123");
			logPage.logIn();
			
			assertTrue(logPage.isEmailErrorPresent());
		}
	
//	Correct Email, correct uppercase password, click on Login
	
	@Test(priority=10)
	  public void LoginPage11() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmail.com","QWE123");
			logPage.logIn();
			
			logPage.invalidCredDisplayed();
			
			assertTrue(logPage.invalidCredDisplayed());

		}
	
//	Correct password in email and correct email in password field, click on Login
	@Test(priority=11)
	  public void LoginPage12() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("qwe123", "goranpopovic1993@gmail.com");
			logPage.logIn();
			
			assertTrue(logPage.isEmailErrorPresent());
			assertTrue(logPage.isPassErrorPresent());
		}
	
//	Correct email, password with less than 6 characters, click on Login
	
	@Test(priority=12)
	  public void LoginPage13() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.fillData("goranpopovic1993@gmail.com", "qwe1");
			logPage.logIn();
			
			assertTrue(logPage.isPassErrorPresent());
		}
	
//	Correct email, password with more than 20 characters, click on Login
	
	@Test(priority=13)
	  public void LoginPage14() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			
			logPage.fillData("goranpopovic1993@gmail.com", "qwe123kjkjkjkjkjkjkjkjkj");
			logPage.logIn();
			
			assertTrue(logPage.isPassErrorPresent());
		}
	
//	Correct email, click on visible icon and type correct pass, click on Login
//  Happy path
	
	@Test(priority=14)
	  public void LoginPage15() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			logPage.visiblePassword();
			logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
			logPage.logIn();
			
		}
	
//	Correct email , correct password , click on Login
//  Happy path
	
	@Test(priority=15)
	  public void LoginPage16() {
		  driver.get("http://app.invoice-factory.source-code.rs");
		  logPage = new Login(driver);
			assertTrue(logPage.isEmail());
			assertTrue(logPage.isPass());
			assertTrue(logPage.isAt());
			
			
			logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
			logPage.logIn();
			
			
		}
	

}