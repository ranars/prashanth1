package myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListAndMultiList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\rana_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://chandanachaitanya.github.io/selenium-practice-site/");
		//wd.findElement(By.xpath("//select[@id='programming-languages']")).click();
		//list
		Select s1=new Select(wd.findElement(By.xpath("//select[@id='programming-languages']")));
		s1.selectByValue("PHP");
		//multilist
		Select s2=new Select(wd.findElement(By.name("selenium_suite")));
		s2.selectByValue("IDE");
		s2.selectByValue("RC");
		s2.deselectByValue("IDE");

	}

}
