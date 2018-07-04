package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageLogin {
	private WebDriver driver;
	private By userField;
	private By passwordField;
	private By loginButton;
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		userField 		= By.name("userName");
		passwordField 	= By.name("password");
		loginButton		= By.name("login");
	}
	
	public void login(String user, String pass) {
		driver.findElement(userField).sendKeys(user);
		driver.findElement(passwordField).sendKeys(pass);
		driver.findElement(loginButton).click();
		Helpers helpers = new Helpers();	
		helpers.SleepSeconds(4);
	}
}
