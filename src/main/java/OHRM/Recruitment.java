package OHRM;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_classes.RecruitmentModule;
import page_classes.LoginPage;

public class Recruitment {

	WebDriver driver;

@BeforeTest
public void m() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\my lap\\Downloads\\eclipse-dsl-2022-09-R-win32-x86_64\\Jars\\chromedriver.exe");
	ChromeOptions	options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
}

@Test(priority = 0)
public void login() throws Exception {

	LoginPage obj1= new LoginPage();
	obj1.Dashboard(driver);
	obj1.enterUsername("Admin");
	obj1.enterPassword("admin123");
	obj1.clickLogin();
	
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
	String currenturl = driver.getCurrentUrl();
    Assert.assertEquals(url, currenturl);
	System.out.println("Login successfull\n");

}
@Test(priority = 1)
public void recruitmentModule() throws Exception {
	
	RecruitmentModule rec = new RecruitmentModule();
	rec.Dashboard1(driver);
    boolean recruitmentlink = rec.recruitmentlinkIsDisplayed();
            Assert.assertEquals(recruitmentlink, true);
            System.out.println("Recruitment link is displayed\n");

    rec.recruitmentlinkIsclickable();
	        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewCandidates";
	        String currenturl = driver.getCurrentUrl();
            Assert.assertEquals(url, currenturl);
	        System.out.println("Recruitment link is clickable\n");

}
@Test(priority = 2)
public void Candidates_detailsForm() throws Exception {
	
	RecruitmentModule rec = new RecruitmentModule();
	rec.Dashboard1(driver);
    boolean JobTitle = rec.JobTitleIsDisplayed();
	        Assert.assertEquals(JobTitle, true);
            System.out.println("Job Title is displayed");
    
	rec.JobTitleSlectboxIsclickable();
	rec.InputJobTitle("Account Assistant");
	boolean B =rec.JobTitleSlectboxIsEnabled();
	        Assert.assertEquals(B, true);
	        System.out.println("Job Title is Enabled\n");
	
	boolean v =  rec.vacancyIsDisplayed();
            Assert.assertEquals(v, true, "vacancy field is not displayed");
            System.out.println("Vacancy field is available");
    
    boolean v2 = rec.vacancyIsEnablede();
            Assert.assertEquals(v2, true, "vacancy field is not enabled");
            System.out.println("Vacancy field is Enabled\n");
            Actions a = new Actions(driver);
                    a.sendKeys(Keys.PAGE_UP).build().perform();
    
    boolean hm = rec.HiringManagerIsDisplayed();
            Assert.assertEquals(hm, true);
            System.out.println("Hiring Manageris available");
    
    boolean hm2 = rec.HiringManagerIsEnabled();
            Assert.assertEquals(hm2, true, "Hiring Manager field is not enabled");
            System.out.println("Hiring Manager field is Enabled\n");
  
    boolean S = rec.StatusIsDisplayed();   
            Assert.assertEquals(S, true);
            System.out.println("Status field is available");

    rec.StatusIsclickable();
    rec.StatusSelected();
       System.out.println("Status is displaying Status\n");
    
    boolean cn = rec.CandidatenameIsDisplayed();
            Assert.assertEquals(cn, true,"Candidate name field not displayed");
            System.out.println("Candidate name field is available");
    	
    boolean cn2 = rec.CandidatenameIsEnabled();
            Assert.assertEquals(cn2, true,"Candidate name field not Enabled");
   	        System.out.println("Candidate name field is Enabled\n");
   	
   	rec.Input_Keyword("A");
    rec.Input_Element("2021-11-09");
   	rec.ElementIsclickable();
   	rec.Input_Element2("2023-05-16");
    rec.Element2Isclickable();
   	
    boolean Mof = rec.MethodofAppIsDisplayed();  
             Assert.assertEquals(Mof, true);
             System.out.println("Methods of Application field is available");
             rec.MethodofApp_selectIsclickable();
             rec.selectMethodofAppIsclickable();
             System.out.println("Methods of Application is displaying methods\n");
    
    boolean SB = rec.SearchButtonIsDisplayed();
             Assert.assertEquals(SB, true);
             System.out.println("Search Button is available\n");

    rec.SearchButtonIsclickable();
}












































}
