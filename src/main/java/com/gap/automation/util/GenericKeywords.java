package com.gap.automation.util;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;



public class GenericKeywords {
	
	private WebDriver driver;
	



	public Properties prop;
	public SoftAssert softAssert=new SoftAssert();
	
	private static GenericKeywords genericKeywords;

	
	
	
	
	public static GenericKeywords getGenericKeywords() {
		return genericKeywords;
	}



	public static void setGenericKeywords(GenericKeywords genericKeywords) {
		GenericKeywords.genericKeywords = genericKeywords;
	}



	public GenericKeywords() {
		this.driver = SeleniumDriver.getDriver();
		prop=new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//env.properties");
			prop.load(fs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}



	public static void setUpGenericKeywords() {
	       if (genericKeywords == null)
	    	   genericKeywords = new GenericKeywords();
	        }
	
	public WebDriver getDriver() {
		return driver;
	}



	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	
public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Seli\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
		
		
		//maximise the browser
		driver.manage().window().maximize();
		//set the implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}
	


public void navigate(String objectkey) {
	//System.out.println("navigate"+ envProp.getProperty(objectkey));
//	test.log(Status.INFO,"navigate "+ envProp.getProperty(objectkey));
	driver.get(prop.getProperty(objectkey));
}
	
	
	public void click(String objectkey) {
		//System.out.println("click"+ prop.getProperty(objectkey));
//		test.log(Status.INFO,"click "+ prop.getProperty(objectkey));
		getelement(objectkey).click();
		//test.log(Status.INFO,"after click ");
	}

	
	public void type(String objectkey,String datakey) {
		//System.out.println("type on object: "+ prop.getProperty(objectkey)+"   and value is"+data.get(datakey));
//		test.log(Status.INFO,"type on object: "+ prop.getProperty(objectkey)+"   and value is"+data.get(datakey));
		getelement(objectkey).clear();
		getelement(objectkey).sendKeys((datakey));
	}
	
	public WebElement getelement(String objectkey) {
		WebElement e=null;
		try {
			
//			if(objectkey.endsWith("_xpath"))
			e=driver.findElement(By.xpath((objectkey)));
//			else if(objectkey.endsWith("_id"))
//				e=driver.findElement(By.id(prop.getProperty(objectkey)));
//			else if(objectkey.endsWith("_css"))
//				e=driver.findElement(By.cssSelector(prop.getProperty(objectkey)));	
//			else if(objectkey.endsWith("_name"))
//				e=driver.findElement(By.name(prop.getProperty(objectkey)));	
//			//visibility object 
		WebDriverWait wait = new WebDriverWait(driver, 20);		
		wait.until(ExpectedConditions.visibilityOf(e));
		//state of object 
		wait.until(ExpectedConditions.elementToBeClickable(e));
		}
		catch (Exception exe) {
			exe.printStackTrace();
			//failure
			reportFailure("Object Not found : "+ objectkey);
		}
				return e;
	}
	
	
	public List<WebElement> getelements(String objectkey) {
		List<WebElement>  e=null;
		try {
			
//			if(objectkey.endsWith("_xpath"))
			e=driver.findElements(By.xpath((objectkey)));
//			else if(objectkey.endsWith("_id"))
//				e=driver.findElement(By.id(prop.getProperty(objectkey)));
//			else if(objectkey.endsWith("_css"))
//				e=driver.findElement(By.cssSelector(prop.getProperty(objectkey)));	
//			else if(objectkey.endsWith("_name"))
//				e=driver.findElement(By.name(prop.getProperty(objectkey)));	
//			//visibility object 
		WebDriverWait wait = new WebDriverWait(driver, 20);		
		wait.until(ExpectedConditions.visibilityOf(e.get(0)));
		//state of object 
		wait.until(ExpectedConditions.elementToBeClickable(e.get(0)));
		}
		catch (Exception exe) {
			exe.printStackTrace();
			//failure
			reportFailure("Object Not found : "+ objectkey);
		}
				return e;
	}
	
	
	
	public boolean isElementPresent(String objectkey ){
		List<WebElement> abc=null;
		
			abc=driver.findElements(By.xpath((objectkey)));
			
		
		if(abc.size()>0){
			return true;
		}
		else
			return false;
	}

	

	public void mousedown(String objectKey){
		
		WebElement e=null;
		Actions act= new Actions(driver) ;
		try{
		e=driver.findElement(By.xpath((objectKey)));
		}catch (Exception exe) {
			exe.printStackTrace();
			//failure
			reportFailure("Object Not found : "+ objectKey);
		}
		act.moveToElement(e).click().build().perform();;
		
		
	}
	

	
	
	public void reportFailure(String failuremessage){
//		//fail the test case
//		test.log(Status.FAIL,failuremessage);
//		//take screenshot and embed it in the reports
//		//fail in testng
//		takeScreenshoot();
//		if(proceedonFail.equalsIgnoreCase("Y")){// use softassertion
//			test.log(Status.INFO,"inside report failure if case");
//		softAssert.fail(failuremessage);
//		}
//		else{
//			test.log(Status.INFO,"inside report failure else case");
			softAssert.fail(failuremessage);
			softAssert.assertAll();
//		}
			
	}
	
	public void takeScreenshoot(){
//		//screenshot file name and path 
//			// fileName of the screenshot
//					Date d=new Date();
//					String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
//					// take screenshot
//					File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//					try {
//						// get the dynamic folder name
//						FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+screenshotFile));
//						//put screenshot file in reports
////						test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screenshotFile));
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
		}



	public void waitforelement(String objectkey) {
		// TODO Auto-generated method stub
		WebElement e=null;
		try {
			
		
			e=driver.findElement(By.xpath((objectkey)));
			
			//visibility object 
		WebDriverWait wait = new WebDriverWait(driver, 20);		
		wait.until(ExpectedConditions.visibilityOf(e));
		//state of object 
		wait.until(ExpectedConditions.elementToBeClickable(e));
		}
		catch (Exception exe) {
			exe.printStackTrace();
			//failure
			reportFailure("Object Not found : "+ objectkey);
		}
	}



	public void selectdropdown(WebElement object,String value) {

		Select select=new Select(object);
		select.selectByValue(value);
		
	}
	
	
	public String gettext(WebElement object) {

		String value=object.getText();
		return value;
	}
		
	
}
