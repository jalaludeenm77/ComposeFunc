package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefComposeMail {
	WebDriver driver;

	@Given("user is on gmail homepage")
	public void user_is_on_gmail_homepage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid="
				+ "1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2"
				+ "Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		WebElement textEmail = driver.findElement(By.id("identifierId"));
		textEmail.sendKeys("testemailforincubyte@gmail.com");
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
		Thread.sleep(3000);
		WebElement textPassword = driver.findElement(By.name("password"));
		textPassword.sendKeys("A9988776655.");
		WebElement btnNext2 = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext2.click();

	}

	@Given("user should click on compose button")
	public void user_should_click_on_compose_button() throws InterruptedException {
		Thread.sleep(3000);
		WebElement btnCompose = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
		btnCompose.click();
		Thread.sleep(3000);

	}

	@When("user enters To and Body and Subject")
	public void user_enters_To_and_Body_and_Subject() throws InterruptedException {
		WebElement textBoxTo = driver.findElement(By.name("to"));
		textBoxTo.sendKeys("jalaludeenm77@gmail.com");
		Thread.sleep(8000);
		WebElement textBoxSub = driver.findElement(By.name("subjectbox"));
		textBoxSub.sendKeys("Incubyte");
		Thread.sleep(10000);
		WebElement textBoxBody = driver.findElement(By.xpath("//div[@role='textbox']"));
		textBoxBody.sendKeys("Automation QA test for Incubyte");
		
	}

	@When("user should click on send button")
	public void user_should_click_on_send_button() throws InterruptedException {
		Thread.sleep(6000);
		WebElement btnSend = driver.findElement(By.xpath("//div[text()='Send']"));
		btnSend.click();
	}

	@Then("user need to verify the mail is sent or not")
	public void user_need_to_verify_the_mail_is_sent_or_not() {
		driver.quit();
	}



}
