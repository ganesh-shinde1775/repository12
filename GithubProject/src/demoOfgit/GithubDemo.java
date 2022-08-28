package demoOfgit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Java files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		Thread.sleep(5000);
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(000,1000)");
		Thread.sleep(5000);
		j.executeScript("window.scrollBy(000,-500)");
		System.out.println("---Scroll UP to specific element----");
		WebElement HTMLQuiz=driver.findElement(By.xpath("//a[text()='Start HTML Quiz!']"));
		j.executeScript("arguments[0].scrollIntoView(true);",HTMLQuiz);
		Thread.sleep(1000);
		driver.quit();	

	}

}
