package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class directoryModule {
	 WebDriver driver;
	 By directorylink = By.xpath("//span[text()='Directory']");
	 By directory = By.xpath("(//*[text()='Directory'])[1]");
	 By EmployeeName = By.xpath("//label[text()='Employee Name']");
	 By EmpName = By.xpath("//input[@placeholder='Type for hints...']");
	 By JobTitle = By.xpath("//*[text()='Job Title']");
	 By JT= By.xpath("//*[text()='Job Title']");
	 By selectJobTitle = By.xpath("(//*[text()='Chief Technical Officer'])[1]");
	 By Location = By.xpath("//*[text()='Location']");
	 By L1 = By.xpath("(//*[text()='-- Select --'])[2]");
	 By Selectloc = By.xpath("(//*[text()='-- Select --'])[2]");
	 By Search = By.xpath("//*[@type='submit']");
	 By S1= By.xpath("//*[@type='submit']");
	
	 public void Dashboard1(WebDriver driver) {
			this.driver=driver;
		}
	 public boolean directoryModuleIsDisplayed() {
			return driver.findElement(directorylink).isDisplayed();
			}
	 public void directoryModuleIsClickable() {
			driver.findElement(directory).click();
	 }
	 
	 public boolean EmployeNameIsDisplayed() {
			return driver.findElement(EmployeeName).isDisplayed();
	 }
	
	 public void EmployeName(String emname ) {
			driver.findElement(EmpName).sendKeys(emname);
	 }
	 
	 public boolean JobTitleIsDisplayed() {
			return driver.findElement(JobTitle).isDisplayed();
	 }
	 
	 public void JobTitleisClickable() {
			driver.findElement(JT).click();
	 }
	 public void SelectJob() {
			driver.findElement(selectJobTitle).click();;
			}
	 
	public boolean LocationIsDisplayed() {
			return driver.findElement(Location).isDisplayed();
	 }
	 public void LocationIsClickable() {
			driver.findElement(L1).click();;
	 }
	 public void SelectLocation() {
			driver.findElement(Selectloc).click();
	 }
	 public boolean searchButtonIsDisplayed() {
			return driver.findElement(Search).isDisplayed();
	 }
	 public void clickOnsearch() {
			driver.findElement(S1).click();
	 }
}
	 




