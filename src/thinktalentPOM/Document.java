package thinktalentPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document 
{
	  public Document(WebDriver driver)
      {
    	  PageFactory.initElements(driver,this);
      }
	  
	  @FindBy (xpath ="//input[@name='firstName']" )
	  private WebElement firstnametf;
	  
	  @FindBy (xpath ="//input[@name='lastName']" )
	  private WebElement lastnametf;
	  
	  @FindBy (xpath ="//input[@name='email']" )
	  private WebElement emailtf;
	  
	  @FindBy (xpath ="//input[@name='name']" )
	  private WebElement accounttf;
	  
	  @FindBy (xpath ="//input[@pattern='^[a-zA-Z0-9]+$']" )
	  private WebElement domaintf;
	  
	  @FindBy (xpath ="//div[@class='next_select__control css-yk16xz-control']" )
	  private WebElement moduletf;
	  
	  @FindBy (xpath ="//div[text()='Courses']" )
	  private WebElement coursestf;
	  
	  @FindBy (xpath ="//div[text()='360 Feedback Survey']" )
	  private WebElement FeedbackSurveytf;
	  
	  @FindBy (xpath ="//div[text()='Learning Journeys']" )
	  private WebElement LearningJourneystf;
	  
	  @FindBy (xpath ="//div[text()='Events']" )
	  private WebElement Eventstf;
	  
	  @FindBy (xpath ="//div[text()='Assessments']" )
	  private WebElement Assessmentstf;
	  
	  @FindBy (xpath ="//button[@type='button']" )
	  private WebElement nexttf;

	public WebElement getFirstnametf() {
		return firstnametf;
	}

	public void setFirstnametf(WebElement firstnametf) {
		this.firstnametf = firstnametf;
	}

	public WebElement getLastnametf() {
		return lastnametf;
	}

	public void setLastnametf(WebElement lastnametf) {
		this.lastnametf = lastnametf;
	}

	public WebElement getEmailtf() {
		return emailtf;
	}

	public void setEmailtf(WebElement emailtf) {
		this.emailtf = emailtf;
	}

	public WebElement getAccounttf() {
		return accounttf;
	}

	public void setAccounttf(WebElement accounttf) {
		this.accounttf = accounttf;
	}

	public WebElement getDomaintf() {
		return domaintf;
	}

	public void setDomaintf(WebElement domaintf) {
		this.domaintf = domaintf;
	}

	public WebElement getModuletf() {
		return moduletf;
	}

	public void setModuletf(WebElement moduletf) {
		this.moduletf = moduletf;
	}

	public WebElement getCoursestf() {
		return coursestf;
	}

	public void setCoursestf(WebElement coursestf) {
		this.coursestf = coursestf;
	}

	public WebElement getFeedbackSurveytf() {
		return FeedbackSurveytf;
	}

	public void setFeedbackSurveytf(WebElement feedbackSurveytf) {
		FeedbackSurveytf = feedbackSurveytf;
	}

	public WebElement getLearningJourneystf() {
		return LearningJourneystf;
	}

	public void setLearningJourneystf(WebElement learningJourneystf) {
		LearningJourneystf = learningJourneystf;
	}

	public WebElement getEventstf() {
		return Eventstf;
	}

	public void setEventstf(WebElement eventstf) {
		Eventstf = eventstf;
	}

	public WebElement getAssessmentstf() {
		return Assessmentstf;
	}

	public void setAssessmentstf(WebElement assessmentstf) {
		Assessmentstf = assessmentstf;
	}

	public WebElement getNexttf() {
		return nexttf;
	}

	public void setNexttf(WebElement nexttf) {
		this.nexttf = nexttf;
	}
	  
}
