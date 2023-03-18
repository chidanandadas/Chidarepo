package thinktalentPOM;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implimentation 
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
	WebDriver refvar=new ChromeDriver();
	refvar.manage().window().maximize();
	refvar.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	refvar.get("https://nextv3.elemetrik.net/elemetrik-registration/signup/registration");
	
	
	Document test=new Document(refvar);
	test.getFirstnametf().sendKeys("chidananda");
	Thread.sleep(2000);
	test.getLastnametf().sendKeys("das");
	Thread.sleep(2000);
	test.getEmailtf().sendKeys("daschidananda16@gmail.com");
	Thread.sleep(2000);
	test.getAccounttf().sendKeys("thinktgalent9");
	Thread.sleep(2000);
	test.getDomaintf().sendKeys("thinktgalent9");
	Thread.sleep(2000);
	test.getModuletf().click();
	Thread.sleep(2000);
	test.getCoursestf().click();
	Thread.sleep(2000);
	test.getNexttf().click();
	Thread.sleep(8000);
	
	((JavascriptExecutor)refvar).executeScript("window.open()");
	ArrayList<String> tabs=new ArrayList<>(refvar.getWindowHandles());
	refvar.switchTo().window(tabs.get(1));
    refvar.get("https://mail.google.com");
    
    GmailDocument test1=new GmailDocument(refvar);
    Thread.sleep(2000);
    test1.getEmailtf().sendKeys("daschidananda16@gmail.com");
    Thread.sleep(2000);
    test1.getEmailclicktf().click();
    Thread.sleep(2000);
    test1.getPasswordtf().sendKeys("Das@1234");
    Thread.sleep(2000);
    test1.getPasswordclicktf().click();
    Thread.sleep(2000);
    test1.getMsgclicktf().click();
    Thread.sleep(2000);
    test1.getCompletesetupclicktf().click();
    
    ArrayList<String> tabs1=new ArrayList<>(refvar.getWindowHandles());
    refvar.switchTo().window(tabs1.get(2));
    System.out.println(refvar.getTitle());
    refvar.findElement(By.cssSelector("#exampleEmail")).sendKeys("Das@1234");
    refvar.findElement(By.xpath("//button[@class='setup_btn  setup_btn btn-block btn btn-secondary']"));
    refvar.findElement(By.xpath("//button[@type='button']")).click();
   // refvar.findElement(By.xpath("//button[@class='next_btn client_btn_font_size btn btn-secondary']")).click();
    
    
}
}
