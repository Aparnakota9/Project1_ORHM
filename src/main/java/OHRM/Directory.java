package OHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page_classes.directoryModule;
import page_classes.LoginPage;

public class Directory {
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
	public void directoryModule() throws Exception {
		
		directoryModule obj2=new directoryModule() ;
		obj2.Dashboard1(driver);
		boolean Directorylink= obj2.directoryModuleIsDisplayed();
	            Assert.assertEquals(Directorylink,true);
	            System.out.println("Directory link is displayed");
	
	    obj2.directoryModuleIsClickable();
	            String url = "https://opensource-demo.orangehrmlive.com/web/index.php/directory/viewDirectory";
		        String currenturl = driver.getCurrentUrl();
	            Assert.assertEquals(url, currenturl);
	            System.out.println("Directory link is clickable\n");
		
	    boolean EmployeeName = obj2.EmployeNameIsDisplayed();
		        Assert.assertEquals(EmployeeName, true,"EmployeeName textbox is displayed\n");
		        System.out.println("EmployeeName textbox is displayed");
		
		obj2.EmployeName("Odis Adalwin");
		        System.out.println("User able to input Employee name\n");
	
        boolean JobTitle = obj2.JobTitleIsDisplayed();
		        Assert.assertEquals(JobTitle, true);
		        System.out.println("Job Title is displayed");
		
        obj2.JobTitleisClickable();
       
        System.out.println("User is able to click and select job titles\n");
	
		 boolean Location = obj2.LocationIsDisplayed();
 		        Assert.assertEquals(Location, true);
 		        System.out.println("Location is displayed");
 		 
 		obj2.directoryModuleIsClickable();
 		        System.out.println("Location is clickable");
 		        System.out.println("user is able to select location\n");
	
 		 boolean Search =obj2.searchButtonIsDisplayed();
		        Assert.assertEquals(Search,true);
		        System.out.println("Search button is displayed\n");
		 
		 obj2.clickOnsearch();
		 
	}
}
