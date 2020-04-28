package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
        bo.manage().window().maximize();
        bo.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		bo.findElement(By.id("win1")).click();
		Thread.sleep(3000);
		///html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]
		String wn=bo.getWindowHandle();
		System.out.println(wn);
		
		bo.switchTo().window(wn);
		//bo.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();	
      Thread.sleep(4000);
		bo.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();


	}

}
