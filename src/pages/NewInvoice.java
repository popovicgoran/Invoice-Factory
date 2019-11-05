package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewInvoice extends PageObject {
	
	@FindBy(id="click-to-enter")
	WebElement clickToEnterTitle; 
	
	@FindBy(css="div#app main > div")
	WebElement draft;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement sent;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(3) > a > div > div")
	WebElement paid;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(4) > a > div > div")
	WebElement invalidated;
	
	@FindBy(css="div#app div:nth-child(3) > div:nth-child(1) > div > div > div.flex > div > div > div.v-input__slot > div > div > div > div.v-select__selections")
	WebElement selectClient;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(1) > a > div > div")
	WebElement client1;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement client2;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(3) > a > div > div")
	WebElement client3;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(4) > a > div > div")
	WebElement client4;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(5) > a > div > div")
	WebElement client5;
	
	@FindBy(css="div#app div:nth-child(3) > div:nth-child(1) > div > div > div.flex > div > div > div.v-text-field__details > div > div > div")
	WebElement clientFieldError;
	
	@FindBy(css="div#app div:nth-child(2) > div > div > div.flex > div > div > div.v-input__slot > div > div > div > div.v-select__selections")
	WebElement selectFrom;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(1) > a > div > div")
	WebElement from1;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(2) > a > div > div")
	WebElement from2;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(3) > a > div > div")
	WebElement from3;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(4) > a > div > div")
	WebElement from4;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div > div:nth-child(5) > a > div > div")
	WebElement from5;
	
	@FindBy(css="div#app div:nth-child(2) > div > div > div.flex > div > div > div.v-text-field__details > div > div > div")
	WebElement businessFieldError;
	
	@FindBy(css="input#inv-form-number")
	WebElement invoiceNumber;
	
	@FindBy(css="div#app div.flex.xs2 > div > div > div > div > div.v-text-field__details > div > div > div")
	WebElement invoiceNumberErrorField;
	
	@FindBy(css="input#inv-form-date-submitted")
	WebElement submitted;
	
	@FindBy(css="div#app tr:nth-child(3) > td:nth-child(3) > button[type=\"button\"] > div")
	WebElement submittedDate;
	
	@FindBy(css="button#inv-form-date-any-submitted > div")
	WebElement submittedAnyTime;
	
	@FindBy(css="button#inv-form-date-ok-submitted > div")
	WebElement submittedOk;
	
	@FindBy(css="button#inv-form-date-cancel-submitted > div")
	WebElement submittedCancel;
	
	@FindBy(css="input#inv-form-date-duedate")
	WebElement dueDate;
	
	@FindBy(css="div#app div.v-menu__content.menuable__content__active > div > div.v-picker__body > div > div.v-date-picker-table.v-date-picker-table--date > table > tbody > tr:nth-child(5) > td:nth-child(2) > button[type=\"button\"] > div")
	WebElement dueDateDate;
	
	@FindBy(css="button#inv-form-date-any-duedate > div")
	WebElement dueDateAnyTime;
	
	@FindBy(css="button#inv-form-date-cancel-duedate > div")
	WebElement dueDateCancel;
	
	@FindBy(css="button#inv-form-date-ok-duedate > div")
	WebElement dueDateOk;
	
	@FindBy(css="input#inv-form-basis")
	WebElement basis;
	
	@FindBy(css="div#app div:nth-child(4) > div > div > div.v-input__control > div.v-text-field__details > div > div > div")
	WebElement basisError;
	
	@FindBy(css="div#app div.flex.xs4.ml-2 > div > div > div.v-input__slot > div > div > div > div.v-select__selections")
	WebElement currency;
	
	@FindBy(css="div#app div.flex.xs4.ml-2 > div > div > div.v-text-field__details > div > div > div")
	WebElement currencyError;
	
	@FindBy(css="button#add-content-btn > div")
	WebElement addNew;
	
	@FindBy(css="div#app div.layout.ml-4.mr-3 > div:nth-child(1) > div > div > div.v-input__slot > div > label")
	WebElement service;
	
	@FindBy(css="div#app div.layout.ml-4.mr-3 > div:nth-child(1) > div > div > div.v-text-field__details > div > div > div")
	WebElement serviceError;
	
	@FindBy(css="input#inv-form-note-0")
	WebElement note;
	
	@FindBy(css="div#app div.layout.ml-4.mr-3 > div:nth-child(2) > div > div > div.v-text-field__details > div > div > div")
	WebElement noteError;
	
	@FindBy(css="input#inv-form-days-0")
	WebElement days;
	
	@FindBy(css="input#inv-form-hours-0")
	WebElement hours;
	
	@FindBy(css="input#inv-form-rate-0")
	WebElement ratePerHour;
	
	@FindBy(css="input#inv-form-amount-0")
	WebElement amount;
	
	@FindBy(css="button#context-delete-inv-content-delete-0 i")
	WebElement delete;
	
	@FindBy(css="button#context-download-dialog-no-inv-content-delete-0")
	WebElement deleteNo;
	
	@FindBy(css="button#context-download-dialog-yes-inv-content-delete-0 > div")
	WebElement deleteYes;
	
	@FindBy(css="textarea#inv-form-notes")
	WebElement notes;
	
	@FindBy(css="input#inv-form-discount")
	WebElement discount;
	
	@FindBy(css="input#inv-form-tax")
	WebElement tax;
	
	@FindBy(css="strong#inv-form-total")
	WebElement total;
	
	@FindBy(css="div#app div.flex.xs2 > div > div > div.v-input__slot > div > div > div > label")
	WebElement selectBusiness;
	
	@FindBy(css="div#app div.flex.xs2 > div > div > div.v-text-field__details > div > div > div")
	WebElement selectBusinessError;
	
	@FindBy(css="a#inv-form-cancel-btn > div")
	WebElement cancel;
	
	@FindBy(css="button#inv-form-save-btn > div")
	WebElement save;
	
	public NewInvoice(WebDriver driver) {
		super(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
