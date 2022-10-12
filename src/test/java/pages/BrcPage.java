package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BrcPage {
    public BrcPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement login;
    @FindBy(xpath = "(//*[@role='button'])[1]")
    public WebElement loginButton;
    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement paswordButton;
    @FindBy(xpath = "(//*[.=' Login'])[5]")
    public WebElement emailPaswordOnay;
    @FindBy(xpath = "//button[@id='dropdown-basic-button']")
    public WebElement anaSayfa;
    @FindBy(xpath = "(//*[text()=' Login'])[2]")
    public WebElement ikinciLogin;

    public static class AutomationPage {
    }
}
