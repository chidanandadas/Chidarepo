package thinktalent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillink 
{
  public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
		WebDriver refvar=new ChromeDriver();
		
		refvar.manage().window().maximize();
		refvar.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		refvar.get("https://nextv3.elemetrik.net/elemetrik-registration-service/registration/validate/BC8F6207AF9D8CAFC852F924FDBAE6C1?client=240CE6AC242473B240AB1EA00B2AA9A5");
		//refvar.findElement(By.cssSelector("#exampleEmail")).sendKeys("Das@1234");
		refvar.findElement(By.xpath("//button[@class='next_btn client_btn_font_size btn btn-secondary']")).click();
		
		
}
}
