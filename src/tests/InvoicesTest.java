package tests;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.Invoices;
import pages.Login;

public class InvoicesTest extends InitTest {
	Login logPage;
	Invoices InvPage;
	
	
	@Test(priority=16) 
    public void SelectAllClients() {
 
	  InvPage = new Invoices(driver);
	  logPage = new Login(driver);
	  
	  driver.get("http://app.invoice-factory.source-code.rs");
  
	    logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
	  	
		InvPage.clickOnWait();
		InvPage.clickOnSelectClient();
		InvPage.allClients();
	
		assertTrue(InvPage.invoicesListPresent());
		assertTrue(InvPage.usernamePresent());
	}
	
	@Test(priority=17)
	public void SelectClient1() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickOnWait();
		InvPage.clickOnSelectClient();
		InvPage.client1();
		
	}

	@Test(priority=18)
	public void SelectClient2() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickOnWait();
		InvPage.clickOnSelectClient();
		InvPage.client2();
		
	}
	
	@Test(priority=19)
	public void SelectClient3() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickOnWait();
		InvPage.clickOnSelectClient();
		InvPage.client3();	
	}
	
	@Test(priority=20)
	public void SelectFrom() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromAnyTime();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromDate();
		InvPage.fromOk();	
	}
	
	@Test(priority=20)
	public void SelectTo() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toAnyTime();
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toDateClickable();
		InvPage.toDate();
		InvPage.toOk();	
	}
	
	@Test(priority=21)
	public void ThisMonth() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromDate();
		InvPage.fromOk();		
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toDateClickable();
		InvPage.toDate();
		InvPage.toOk();
		
		InvPage.thisLastResetClickable();
		InvPage.thisLastReset();
		InvPage.thisMonth();
	}
	
	@Test(priority=22)
	public void LastMonth() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromDate();
		InvPage.fromOk();		
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toDateClickable();
		InvPage.toDate();
		InvPage.toOk();
		
		InvPage.thisLastResetClickable();
		InvPage.thisLastReset();
		InvPage.lastMonth();
	}
	
	@Test(priority=23)
	public void ResteDates() {	
		InvPage = new Invoices(driver);
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromDate();
		InvPage.fromOk();		
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toDateClickable();
		InvPage.toDate();
		InvPage.toOk();
		
		InvPage.thisLastResetClickable();
		InvPage.thisLastReset();
		InvPage.resetDates();
	}
	
	@Test(priority=24)
	public void ResetAll() {	
		InvPage = new Invoices(driver);
		
		
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.clickFromWait();
		InvPage.clickFrom();
		InvPage.fromDate();
		InvPage.fromOk();		
		
		InvPage.clickToWait();
		InvPage.clickTo();
		InvPage.toDateClickable();
		InvPage.toDate();
		InvPage.toOk();
		
		InvPage.thisLastResetClickable();
		InvPage.thisLastReset();
		InvPage.resetDates();
	}
	
	@Test(priority=25)
	public void ChangeStatus() {	
		InvPage = new Invoices(driver);	
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.ChangeStatusWait();
		InvPage.ChangeStatus();
		InvPage.ChangeStatusDropdown();
		
	}
	
	@Test(priority=26)
	public void EditDropdownTest() {	
		InvPage = new Invoices(driver);	
		logPage = new Login(driver);
		
		driver.get("http://app.invoice-factory.source-code.rs");
		
		logPage.fillData("goranpopovic1993@gmail.com", "qwe123");
		logPage.logIn();
		
		InvPage.EditDropdownClickable();
		InvPage.EditDropdown();
		
	}
	
	
	
	
}
