package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends PageObject {

	public Login(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="login-form-email")
	WebElement email;

	@FindBy(id="login-pass")
	WebElement pass;

	@FindBy(className="v-btn__content")
	WebElement loginBtn;

	@FindBy(css="div#app div.v-text-field__details > div > div > div")
	WebElement emailError;;

	@FindBy(css="div#app div:nth-child(2) > div > div.v-text-field__details > div.v-messages.error--text > div > div")
	WebElement passError;
		
	@FindBy (className="body-2")
	   WebElement invalidCred;
	
	@FindBy(css="div#app div.v-input__append-inner > div > i")
	WebElement visiblePass;

	public void fillData(String userEmail, String password) {
		email.clear();
		email.sendKeys(userEmail);

		pass.clear();
		pass.sendKeys(password);
	}

	public void logIn() {
		loginBtn.click();
	}

	public void visiblePassword() {
		visiblePass.click();
	}
	
	public boolean isEmail() {
		return email.isDisplayed();
	}
	
	public boolean isPass() {
		return pass.isDisplayed();
	}
	
	public boolean isAt() {
		return loginBtn.isDisplayed();
	}
	
	public boolean isEmailErrorPresent() {
		wait.until(ExpectedConditions.visibilityOf(emailError));
		return emailError.isDisplayed();
	}
	
	public boolean isPassErrorPresent() {
		wait.until(ExpectedConditions.visibilityOf(passError));
		return passError.isDisplayed();
	}

	public boolean invalidCredDisplayed() {
	       wait.until(ExpectedConditions.visibilityOf(invalidCred));
	       return invalidCred.isDisplayed();
	   }

}
