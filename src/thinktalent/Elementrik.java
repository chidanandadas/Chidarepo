package thinktalent;

import java.awt.AWTException;


import java.io.IOException;

import java.util.ArrayList;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementrik 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
		WebDriver refvar=new ChromeDriver();
		
		refvar.manage().window().maximize();
		refvar.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		refvar.get("https://nextv3.elemetrik.net/elemetrik-registration/signup/registration");
		
		refvar.findElement(By.xpath("//input[@name='firstName']")).sendKeys("chidananda");
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//input[@name='lastName']")).sendKeys("das");
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//input[@name='email']")).sendKeys("daschidananda16@gmail.com");
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//input[@name='name']")).sendKeys("ThinkTalent4");
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//input[@pattern='^[a-zA-Z0-9]+$']")).sendKeys("nextv24");
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//div[@class='next_select__control css-yk16xz-control']")).click();
		Thread.sleep(2000);
		refvar.findElement(By.xpath("//div[text()='Courses']")).click();
		
		Thread.sleep(2000);
	
		refvar.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		((JavascriptExecutor)refvar).executeScript("window.open()");
		ArrayList<String> tabs=new ArrayList<>(refvar.getWindowHandles());
		refvar.switchTo().window(tabs.get(1));
	    refvar.get("https://mail.google.com");
	    refvar.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("daschidananda16@gmail.com");
	    refvar.findElement(By.xpath("//span[text()='Next']")).click();
	    refvar.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Das@1234");
	    refvar.manage().timeouts().implicitlyWait(4l,TimeUnit.SECONDS);
	    WebElement test=refvar.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")); 
	    test.click();
	  refvar.findElement(By.xpath("//*[@role=\"row\"]")).click();
	  refvar.findElement(By.linkText("Complete Setup")).click();
	  ArrayList<String> tabs1=new ArrayList<>(refvar.getWindowHandles());
	 refvar.switchTo().window(tabs1.get(2));
	 
	  
	  System.out.println(refvar.getTitle());
	  System.out.println(refvar.getCurrentUrl());
	
	  refvar.manage().timeouts().implicitlyWait(4l,TimeUnit.SECONDS);
	  refvar.findElement(By.cssSelector("#exampleEmail")).sendKeys("Das@1234");
	  
	}

}
