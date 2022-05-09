package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    //object repository
    @FindBy(id="txtUsername")
    public WebElement usernameBox;

    @FindBy(name="txtPassword")
    public WebElement passwordBox;

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(xpath="//span[text()=\"Invalid credentials\"]")
    public WebElement invalidMessage;

    @FindBy(xpath="//span[text()=\"Username cannot be empty\"]")
    public WebElement userNameCannotBeEmpty;

    @FindBy(xpath="//span[text()=\"Password cannot be empty\"]")
    public WebElement passwordCannotBeEmpty;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
