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
	
	@When("^User navigates to site (.*com)$")
	public void user_navigates_to_site_www_google_com(String url) throws Throwable {
		driver = new FirefoxDriver();
		driver.get(url);
		
	}

	@And("^User clicks on Images link$")
	public void user_clicks_on_Images_link() throws Throwable {
	    WebElement ImagesLink = driver.findElement(By.linkText("Images"));
	    ImagesLink.click();
	}
	
	@Then("^User inputs (.*) in the search field$")
	public void user_inputs_apple_in_the_search_field(String inputs) throws Throwable {
	    WebElement searchfield = driver.findElement(By.name("q"));
	    searchfield.sendKeys(inputs);
    }
	
	@Then("^User clicks on search icon$")
	public void user_clicks_on_search_icon() throws Throwable {
		WebElement Searchbutton = driver.findElement(By.className("Tg7LZd"));
		Searchbutton.click();
	    
	}

	@Then("^image search is complete$")
	public void image_search_is_complete() throws Throwable {
	    
	}
}