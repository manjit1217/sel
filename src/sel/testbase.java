package sel;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class testbase {
	
	public static  String prop_username,prop_password;

	//static Properties properties;
	
	public void  loadData() throws IOException
	{
		
		Properties obj = new Properties();//Create Object of Properties Class.
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\prop\\data.properties");
		//Create Object of FileInputStream Class. Pass file path.
		obj.load(objfile); //Pass object reference objfile to load method of Properties object.
		prop_username = obj.getProperty("username");
		prop_password = obj.getProperty("password");
		

		//System.out.println(obj.getProperty("username"));	
	}
	
	public static void explicitywait(WebElement element)// explicity wait function we can call every where
	{
		WebDriver driver= new FirefoxDriver();
		WebDriverWait driver_wait = new WebDriverWait(driver,20);
		driver_wait.until(ExpectedConditions.elementToBeClickable(element));
		System.out.println("HI");
		
	}
	/*		properties = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\src\\prop\\data.properties");
// System is class and get property is static method
		FileReader obj = new FileReader(f); 
		properties.load(obj);
		
	}
	public static  String getobject(String Data) throws IOException {
		loadData();
		String data = properties.getProperty(Data);
		return data;
	}
*/	

}


