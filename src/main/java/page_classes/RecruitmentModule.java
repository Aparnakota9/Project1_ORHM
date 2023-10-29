package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentModule {
	 WebDriver driver;
	 By recruitmentlink = By.xpath("//*[text()='Recruitment']");
	 By Recruitment = By.xpath("//*[text()='Recruitment']");
	 By JobTitle = By.xpath("//*[text()='Job Title']");
	 By JobTitle_select = By.xpath("(//*[text()='-- Select --'])[1]");
	 By Vacancy = By.xpath("//label[text()='Vacancy']");
	 By HiringManager = By.xpath("//label[text()='Hiring Manager']");
	 By Status = By.xpath("//label[text()='Status']");
	 By Status_select  = By.xpath("(//*[text()='-- Select --'])[3]");
	 By selectStatus = By.xpath("(//*[text()='Interview Scheduled'])[1]");
	 By Candidatename = By.xpath("//*[text()='Candidate Name']");
	 By Input_Keyword = By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]");
	 By element = By.xpath("//*[@placeholder='From']");
	 By element2 = By.xpath("//*[@placeholder='To']");
	 By MethodofApp = By.xpath("//label[text()='Method of Application']");
	 By MethodofApp_select  = By.xpath("(//*[@class='oxd-select-text-input'])[5]");
	 By selectMethodofApp = By.xpath("//*[text()='Online']");
	 By SearchButton = By.xpath("//label[text()='Method of Application']");
	
	 public void Dashboard1(WebDriver driver) {
			this.driver=driver;
		}

	 public void recruitmentlinkIsclickable() {
			driver.findElement(Recruitment).click();
			}
 public boolean recruitmentlinkIsDisplayed() {
		return driver.findElement(Recruitment).isDisplayed();
		}
	public boolean JobTitleIsDisplayed() {
			return driver.findElement(JobTitle).isDisplayed();
			}
	 public void JobTitleSlectboxIsclickable() {
			driver.findElement(JobTitle_select).click();
			}
	 public void InputJobTitle(String Title) {
			driver.findElement(JobTitle_select).sendKeys(Title);
			}
	 public boolean JobTitleSlectboxIsEnabled() {
			return driver.findElement(JobTitle_select).isEnabled();
			}
	 public boolean vacancyIsDisplayed() {
			return driver.findElement(Vacancy).isDisplayed();
			}
	 public boolean vacancyIsEnablede() {
			return driver.findElement(Vacancy).isEnabled();
			}
	 public boolean HiringManagerIsDisplayed() {
			return driver.findElement(HiringManager).isDisplayed();
			}
	 public boolean HiringManagerIsEnabled() {
			return driver.findElement(HiringManager).isEnabled();
			}
	 
	 public boolean StatusIsDisplayed() {
			return driver.findElement(Status).isDisplayed();
			}
	 public void StatusIsclickable() {
			driver.findElement(Status_select).click();
			}
	 public void StatusSelected() {
			driver.findElement(selectStatus).click();
	 }
	 public boolean CandidatenameIsDisplayed() {
			return driver.findElement(Candidatename).isDisplayed();
			}
	 public boolean CandidatenameIsEnabled() {
			return driver.findElement(Candidatename).isEnabled();
			}
	 public void Input_Keyword(String key) {
			driver.findElement(Input_Keyword).sendKeys(key);
			
			}
	 public String Input_KeywordGetAttribute(String value) {
			return driver.findElement(Input_Keyword).getAttribute(value);
			
			}
	 public void Input_Element(String ele) {
			driver.findElement(element).sendKeys(ele);
			
			}
	 public void ElementIsclickable() {
			driver.findElement(element).click();
			}
	 public void Input_Element2(String ele2) {
			driver.findElement(element2).sendKeys(ele2);
			
			}
	 public void Element2Isclickable() {
			driver.findElement(element2).click();
			}
	 public boolean MethodofAppIsDisplayed() {
			return driver.findElement(MethodofApp).isDisplayed();
			}
	 public void MethodofApp_selectIsclickable() {
			driver.findElement(MethodofApp_select).click();
			}
	 public void selectMethodofAppIsclickable() {
			driver.findElement(selectMethodofApp).click();
			}
	 public boolean SearchButtonIsDisplayed() {
			return driver.findElement(SearchButton).isDisplayed();
			}
	 public void SearchButtonIsclickable() {
			driver.findElement(SearchButton).click();
			}

	
}
