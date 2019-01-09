package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition {
	WebDriver driver = null;
	
	@When("^User navigates to google homepage$")
	public void user_navigates_to_google_homepage() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}

	@And("^User clicks on Images link$")
	public void user_clicks_on_Images_link() throws Throwable {
	    WebElement ImagesLink = driver.findElement(By.linkText("Images"));
	    ImagesLink.click();
	}
	
	@Then("^User types apple in the search field$")
	public void user_types_apple_in_the_search_field() throws Throwable {
	    WebElement searchfield = driver.findElement(By.name("q"));
	    searchfield.sendKeys("apple");
    }
	
	@Then("^User clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {
		WebElement Searchbutton = driver.findElement(By.className("Tg7LZd"));
		Searchbutton.click();
	    
	}

	@Then("^Apple image search is complete$")
	public void apple_iamge_search_is_complete() throws Throwable {
	    
	}
}