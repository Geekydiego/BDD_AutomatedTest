package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
 
public class Steps {
 WebDriver driver; 

@Given("^user is in Ebay home page$")
public void user_is_in_Ebay_home_page() throws Throwable {
	
	//Firefox web browser should open
	driver = new FirefoxDriver();
	
	//The browser must maximize screen
	driver.manage().window().maximize();
	
	//Firefox should redirect to the url bellow
	driver.get("http://www.ebay.com");
	System.out.println("Step 1: This means we successfully Open the Firefox and Entered to Ebay homepage");
}

@When("^he first clicks in the top centered searchbox$")
public void he_first_clicks_in_the_top_centered_searchbox() throws Throwable {
	
	//This will select the search box and it will allow to write inside the desired search box
	driver.findElement(By.id("gh-ac")).click();
	System.out.println("Step 2: This means we successfully clicked in the search-box");
}

@When("^he is able to write the word shoes$")
public void he_is_able_to_write_the_word_shoes() throws Throwable { 
	
	//In the search-box we write the string
	String value = "shoe";
	driver.findElement(By.id("gh-ac")).sendKeys(value);
	 System.out.println("Step 3: This means we successfully wrote the word shoes");
}

@Then("^he press the key Enter another page is loaded$")
public void he_press_the_key_Enter_another_page_is_loaded() throws Throwable {
	
	//Here we press the key enter to jump in to the next screen
	driver.findElement(By.id("gh-ac")).sendKeys(Keys.RETURN);
	System.out.println("Step 4: This means we successfully press enter");
}

@Then("^user should not see the homepage$")
public void user_should_not_see_the_homepage() throws Throwable {
	
	//Here we declare the page we expect to see, even do that we are forcing the system to go to the URL below
	driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=shoe&_sacat=0");
	
	// Now we get the current URL we are watching
	String url = driver.getCurrentUrl();
	
	//In here we compare the desired page we are with the current we are
	if(url.equals("https://www.ebay.com/sch/i.html?_from=R40&_trksid=m570.l1313&_nkw=shoe&_sacat=0")) 
	{
	    System.out.println("Step 5A: This message means that you, are no longer in the homepage");
	} 
	else 
	{
	    System.out.println("Step 5B: Fail, the current page is not the one you should be seeing");
	}
}

@When("^Select status “New with box”$")
public void select_status_New_with_box() throws Throwable {
	
	//This 2 lines of JS allow us to scroll the page to the middle
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0,1007)", "");
	
	/*I did this because the page have dynamic links assigned to each element
	So the idea is that one of these links are triggered when we enter this function*/
	WebElement option1 = driver.findElement(By.id("e1-88"));
	if (option1.isDisplayed()) {
		option1.click();
		}
		else {
		WebElement option2 = driver.findElement(By.id("w_1544605695101_cbx"));
		option2.click();
		}

	 System.out.println("Step 6: This means we successfully selected the New with Tags checkbox");
}

@Then("^he should see the page refresh and show results$")
public void he_should_see_the_page_refresh_and_show_results() throws Throwable {
	System.out.println("Step 7: This means we successfully are viewing a page with new shoes with box");
}

@Then("^he selects the brand \"([^\"]*)\"$")
public void he_selects_the_brand(String arg1) throws Throwable {
	
	//Same logic as in the previous funtion. If we cant find the elemnt by ID, then try to find it by CSS Selector 
	WebElement optionA = driver.findElement(By.id("e1-50"));
	if (optionA.isDisplayed()) 
	{
		optionA.click();
	}
	else 
	{
		WebElement optionB = driver.findElement(By.cssSelector("#e1-49 > a.cbx > span.cbx"));
		optionB.click();
	}
	System.out.println("Step 8: This means we successfully selected the nike brand");
}

@When("^Print the number of results in console$")
public void print_the_number_of_results_in_console() throws Throwable {
	
	//The below code was the one I was working on, I hope it gives an Idea of the logic I was trying to use
	
	//WebElement sClass = driver.findElement(By.xpath("//a[contains(text(), 'rcnt')]"));
	System.out.println("Step9: This is the last step and the user will NOT see the expected behaviour");
}


}

