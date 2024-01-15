package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;
import static core.utils.ResourcesUtils.getResource;

public class SignInPage extends BasePage {

    private static final By USERNAME_FIELD = By.xpath("//input[@id='username']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id='password']");
    private static final By ENTER = By.xpath("//input[@value='Login']");
    protected static final String LOGIN = "LOGIN";
    protected static final String PASSWORD = "PASSWORD";


    public SignInPage() {
        super(By.xpath("//div[text()='Please Sign In']"));
    }

    public TicketsPage enterToSystem(){
        waitUntilPresenceOfElementLocated(USERNAME_FIELD).clear();
        waitUntilPresenceOfElementLocated(USERNAME_FIELD).sendKeys(getResource(LOGIN));
        waitUntilPresenceOfElementLocated(PASSWORD_FIELD).clear();
        waitUntilPresenceOfElementLocated(PASSWORD_FIELD).sendKeys(getResource(PASSWORD));
        waitUntilPresenceOfElementLocated(ENTER).click();
        return new TicketsPage();
    }
}
