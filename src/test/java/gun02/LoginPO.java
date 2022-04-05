package gun02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class LoginPO {

    public LoginPO(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public LoginPO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[title='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginLink;

    @FindBy(id = "input-email")
    public WebElement usernameInput;

    @FindBy(id = "input-password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginSubmitButton;

    @FindBy (xpath = "//li//a[text()='Edit Account']")
    public WebElement eEditAccount;

    @FindBy(id = "input-telephone")
    public WebElement eEditTelephone;

    @FindBy(css = "div[class='pull-right'] input")
    public WebElement eContinueButton;

    @FindBy (xpath = "//li//a[text()='Newsletter']")
    public WebElement eNewsletterLink;

    @FindBy(css = "div.alert.alert-success")
    public WebElement successAlert;

    @FindBy(css = "input[name='newsletter'][value='0']")
    public WebElement newsletterYes;

    @FindBy(css = "div.alert.alert-success")
    public WebElement newsletterNo;




}
