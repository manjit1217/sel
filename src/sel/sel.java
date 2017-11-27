package sel;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import net.sourceforge.htmlunit.corejs.javascript.ast.AstNode;
public class sel extends testbase {

 
    public static void main(String[] args) throws IOException {
    	// sel pro= new sel();
    	
        // declaration and instantiation of objects/variables
    	 
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Manjit\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");//geckodriver path
    	//WebDriver driver = new FirefoxDriver();
       
        
        String baseUrl = "http://newtours.demoaut.com";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjit\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();      
        WebDriver driver = new FirefoxDriver();
        
      
       //List<WebElement> tagname= driver.findElements(By.tagName("input"));
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();
       //System.out.println(tagname);
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        WebElement username;
        username = driver.findElement(By.name("userName"));
        
        testbase ld = new testbase();
        ld.loadData();// here it load the tetstbase's loadData() function   
        username.sendKeys(ld.prop_username);
        
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.sendKeys(ld.prop_password);
        
        WebElement login;
        login = driver.findElement(By.name("login"));
        login.click();
        String expectedTitle2 = "Find a Flight: Mercury Tours:";
        String actualtitle2 = "";
        actualtitle2 = driver.getTitle();
        if(actualtitle2.contentEquals(expectedTitle2)){
        	System.out.println("Login success");
             }
        else
        {
        	System.out.println("Unscuss");
        }
        
        //Type radio button selecting
      /*  WebElement type = driver.findElement(By.xpath("//*[@value='oneway']"));
        type.click();
        Boolean b = type.isSelected();
        System.out.println("trip button"+b);*/
        //Dropdown value is selecting
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 WebElement element = driver.findElement(By.xpath("//*[@name='findFlights']"));
 
      // testbase.explicitywait(element);
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
      // driver.manage().timeouts().
       WebElement passanger = driver.findElement(By.name("passCount"));
       Select pass = new Select(passanger);
       pass.selectByValue("3");
    
       Select depart1 = new Select(driver.findElement(By.name("fromPort")));
       depart1.selectByValue("New York");
       
       Select month = new Select(driver.findElement(By.name("fromMonth")));
       month.selectByValue("12");
       Select day = new Select(driver.findElement(By.name("fromDay")));
       day.selectByValue("15");
       Select arrive = new Select(driver.findElement(By.name("toPort")));
       arrive.selectByIndex(3);
       Select month1 = new Select(driver.findElement(By.name("toMonth")));
       month1.selectByValue("December");
       Select day1 = new Select(driver.findElement(By.name("toDay")));
       day1.selectByValue("15");
       
       WebElement service_class = driver.findElement(By.xpath("//input[@value='Business']"));
       service_class.click();
       Select airline = new Select(driver.findElement(By.name("airline")));
       day1.selectByValue("5");
       
       WebElement contune = driver.findElement(By.name("findFlights"));
       contune.click();
       
      WebElement mouse = driver.findElement(By.id(""));
       Actions act = new Actions(driver);
       act.moveToElement(mouse);
       act.perform();
       act.sendKeys(Keys.ENTER);
      
  act.dragAndDrop(contune, mouse);
  
       
        //close Fire fox
        driver.close();
       
        // exit the program explicitly
        System.exit(0);
    }

}