package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Invoices extends PageObject {
	
	@FindBy(className="invoice-factory-header-title ml-3")
	WebElement invoicesText;
	
	@FindBy(id="home-page-user")
	WebElement username;
	
	@FindBy(id="#filter-client")
	WebElement clickOnSelectClient;
	
	@FindBy(css="div#app div.flex.mr-2.ml-4.sm2 > div > div > div.v-input__slot > div > div > div")
	WebElement allClientsClick;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement client1;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(3) > a > div > div")
	WebElement client2;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(4) > a > div > div")
	WebElement client3;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(5) > a > div > div")
	WebElement client4;
	
	@FindBy(css="div#app div:nth-child(6) > a > div > div")
	WebElement client5;
	
	@FindBy(id="#filter-from")
	WebElement clickFrom;
	
	@FindBy(id="#filter-to")
	WebElement clickTo;
	
	@FindBy(css="div#app div.v-date-picker-header > button[type=\"button\"]:nth-child(1) > div > i")
	WebElement fromLeft;
	
	@FindBy(css="div#app button[type=\"button\"]:nth-child(3) > div > i")
	WebElement fromRight;
	
	@FindBy(css="button#filter-from-ok > div")
	WebElement fromOk;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button[type=\"button\"]:nth-child(1) > div > i")
	WebElement toLeft;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-header > button[type=\"button\"]:nth-child(3) > div > i")
	WebElement toRight;
	
	@FindBy(css="button#filter-to-ok > div")
	WebElement toOk;
	
	@FindBy(css="button#filter-from-any > div")
	WebElement fromAnyTime;
	
	@FindBy(css="button#filter-to-any > div")
	WebElement toAnyTime;
	
	@FindBy(css="button#filter-period i")
	WebElement thisLastReset;
	
	@FindBy(css="button#this-month > div")
	WebElement thisMonth;
	
	@FindBy(css="button#last-month > div")
	WebElement lastMonth;
	
	@FindBy(css="button#reset-dates > div")
	WebElement resetDates;
	
	@FindBy(css="button#filter-reset i")
	WebElement resetAll;
	
	@FindBy(id="#add-new-invoice")
	WebElement addNewInvoice;
	
	@FindBy(css="div#app div:nth-child(2) > div > div:nth-child(5) > div > div.flex.xs3.mt-1 > div > button > div > i:nth-child(1)")
	WebElement changeStatus;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[16]/div/div/div[1]/a/div/div")
	WebElement changeStatusDropdown;
	
	@FindBy(id="#context-362")
	WebElement editDropdown;
	
	@FindBy(css="a#context-edit-362 > div")
	WebElement editEdit;
	
	@FindBy(css="a#context-preview-362 > div")
	WebElement preview;
	
	@FindBy(css="button#context-delete-362 > div")
	WebElement delete;
	
	@FindBy(css="div#app tr:nth-child(3) > td:nth-child(3) > button[type=\"button\"] > div")
	WebElement dateFrom;
	
	@FindBy(css="div#app tr:nth-child(4) > td:nth-child(6) > button[type=\"button\"] > div")
	WebElement dateTo;
	
	public Invoices (WebDriver driver) {
		super(driver);	
	}
	
	
	public boolean invoicesListPresent() {
		wait.until(ExpectedConditions.visibilityOf(invoicesText));
		return invoicesText.isDisplayed();
	}
	
	public boolean usernamePresent() {
		wait.until(ExpectedConditions.visibilityOf(username));
		return username.isDisplayed();
	}
	
	public void clickOnWait() {
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectClient));
	}
	
	public void clickOnSelectClient() {
//		wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectClient));
		clickOnSelectClient.click();
	}
	
	public void allClients() {		
		wait.until(ExpectedConditions.elementToBeClickable(allClientsClick));
		allClientsClick.click();
	}
	
	public void client1() {
		wait.until(ExpectedConditions.elementToBeClickable(client1));
		client1.click();
	}
	
	public void client2() {
		wait.until(ExpectedConditions.elementToBeClickable(client2));
		client2.click();
	}
	
	public void client3() {
		wait.until(ExpectedConditions.elementToBeClickable(client3));
		client3.click();
	}
	
	public void client4() {
		wait.until(ExpectedConditions.elementToBeClickable(client4));
		client4.click();
	}
	
	public void client5() {
		wait.until(ExpectedConditions.elementToBeClickable(client5));
		client5.click();
	}
	
	public void clickFromWait() {
		wait.until(ExpectedConditions.elementToBeClickable(clickFrom));
	}
	
	public void clickFrom() {
		//wait.until(ExpectedConditions.elementToBeClickable(clickFrom));
		clickFrom.click();
	}
	
	public void fromDateClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(dateFrom));
	}
	
	public void fromDate() {
		dateFrom.click();
	}
	
	public void toDateClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(dateTo));
	}
	
	public void toDate() {
		dateTo.click();
	}
	
	public void clickToWait() {
		wait.until(ExpectedConditions.elementToBeClickable(clickTo));
	}
	
	public void clickTo() {
		clickTo.click();
	}
	
	public void fromLeft() {
		fromLeft.click();
	}
	
	public void fromRight() {
		fromRight.click();
	}
	
	public void fromOk() {
		fromOk.click();
	}
	
	public void toOk() {
		toOk.click();
	}
	
	public void fromAnyTime() {
		fromAnyTime.click();
	}
	
	public void toAnyTime() {
		toAnyTime.click();
	}
	
	public void thisLastResetClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(thisLastReset));
	}
	
	public void thisLastReset() {
		thisLastReset.click();
	}
	
	public void thisMonth() {
		thisMonth.click();
	}
	
	public void lastMonth() {
		lastMonth.click();
	}
	
	public void resetDates() {
		resetDates.click();
	}
	
	public void resetAll() {
		resetAll.click();
	}
	
	public void ChangeStatusWait() {
		wait.until(ExpectedConditions.elementToBeClickable(changeStatus));
	}
	
	public void ChangeStatus() {
		changeStatus.click();
	}
	
	public void ChangeStatusDropdown() {
		changeStatusDropdown.click();
	}	
	
	public void addNewInvoiceClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectClient));
	}
	
	public void AddNewInvoice() {
	//	wait.until(ExpectedConditions.elementToBeClickable(clickOnSelectClient));
		addNewInvoice.click();
	}
	
	public void EditDropdown() {
		editDropdown.click();
	}
	
	public void EditDropdownClickable() {
		wait.until(ExpectedConditions.elementToBeClickable(editDropdown));
	}
	
	public boolean presentInvoicesText() {
		wait.until(ExpectedConditions.visibilityOf(invoicesText));
		return invoicesText.isDisplayed();
	}
	
	public boolean presentUsername() {
		wait.until(ExpectedConditions.visibilityOf(username));
		return username.isDisplayed();
	}
	
}






