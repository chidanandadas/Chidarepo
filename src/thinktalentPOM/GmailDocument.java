package thinktalentPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailDocument 
{
    public GmailDocument(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    @FindBy (xpath = "//input[@id='identifierId']")
    private WebElement emailtf;
    
    @FindBy (xpath = "//span[text()='Next']")
    private WebElement emailclicktf;
    
    @FindBy (xpath = "//input[@aria-label='Enter your password']")
    private WebElement passwordtf;
    
    @FindBy (xpath = "//span[text()='Next']")
    private WebElement passwordclicktf;
    
    @FindBy (xpath = "//*[@role=\"row\"]")
    private WebElement msgclicktf;
    
    @FindBy (linkText = "Complete Setup")
    private WebElement completesetupclicktf;

	public WebElement getEmailtf() {
		return emailtf;
	}

	public void setEmailtf(WebElement emailtf) {
		this.emailtf = emailtf;
	}

	public WebElement getEmailclicktf() {
		return emailclicktf;
	}

	public void setEmailclicktf(WebElement emailclicktf) {
		this.emailclicktf = emailclicktf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public void setPasswordtf(WebElement passwordtf) {
		this.passwordtf = passwordtf;
	}

	public WebElement getPasswordclicktf() {
		return passwordclicktf;
	}

	public void setPasswordclicktf(WebElement passwordclicktf) {
		this.passwordclicktf = passwordclicktf;
	}

	public WebElement getMsgclicktf() {
		return msgclicktf;
	}

	public void setMsgclicktf(WebElement msgclicktf) {
		this.msgclicktf = msgclicktf;
	}

	public WebElement getCompletesetupclicktf() {
		return completesetupclicktf;
	}

	public void setCompletesetupclicktf(WebElement completesetupclicktf) {
		this.completesetupclicktf = completesetupclicktf;
	}
    
    
    
    
    
    
}
