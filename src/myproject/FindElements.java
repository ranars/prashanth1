package myproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		//no.of links
		List<WebElement> a=wd.findElements(By.tagName("a"));
		System.out.println("No.of links: "+a.size());
		//no.of checkboxes
		List<WebElement> c=wd.findElements(By.xpath("//input[@type='checkbox']"));
	    System.out.println("No.of checkboxes: "+c.size());	
	    List<WebElement> r=wd.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("No.of Radio buttons: "+r.size());
	    List<WebElement> t=wd.findElements(By.tagName("table"));
		System.out.println("No.of tables: "+t.size());

	}

}
