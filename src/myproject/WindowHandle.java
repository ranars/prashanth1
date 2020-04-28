package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		wd.findElement(By.xpath("//button[@id='win1']")).click();
	    String parent=wd.getWindowHandle();
	    //multi window
	    for(String child:wd.getWindowHandles())
	    {
	    	  wd.switchTo().window(child);
        }
        wd.findElement(By.xpath("//input[@name='q']")).sendKeys("xxxxxxxxxxx");
	}
}
