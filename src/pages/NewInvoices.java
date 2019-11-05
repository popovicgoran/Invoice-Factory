package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewInvoices extends PageObject {

	
	@FindBy(id="click-to-enter")
	WebElement enterText;
	
	@FindBy(id="inv-form-status")
	WebElement draft;
	
	@FindBy(id="#inv-form-client")
	WebElement selectTo;
	
	@FindBy(id="#inv-form-business")
	WebElement selectFrom;
	
	@FindBy(id="#inv-form-number")
	WebElement invoiceFormNumber;
	
	@FindBy(id="#inv-form-date-submitted")
	WebElement submitted;
	
	@FindBy(id="#inv-form-date-duedate")
	WebElement dueDate;
	
	@FindBy(id="#inv-form-basis")
	WebElement basis;
	
	@FindBy(id="#inv-currency")
	WebElement currency;
	
	@FindBy(css="button#add-content-btn i")
	WebElement addNew;
	
	@FindBy(id="#inv-form-service-0")
	WebElement addService;
	
	@FindBy(id="#inv-form-note-0")
	WebElement addNote;
	
	@FindBy(id="inv-form-days-0")
	WebElement addDays;
	
	@FindBy(id="#inv-form-hours-0")
	WebElement addHours;
	
	
	
	
	
	
	
	
	public NewInvoices(WebDriver driver) {
		super(driver);
	}

	
}
