package sdetPawan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findPythonCoursePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.letskodeit.com/practice");

WebElement BMW=driver.findElement(By.xpath("//input[@id='bmwcheck']"));
BMW.click();

WebElement Newwindow=driver.findElement(By.xpath("//button[@id='openwindow']"));
Newwindow.click();
	}

}
