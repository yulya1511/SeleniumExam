package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;

public class MainPage extends BasePage {

    private static final By LOG_IN = By.xpath("//a[@id='userDropdown']");

    public MainPage() {
        super(By.xpath("//*[text()='Knowledgebase Articles']"));
    }

    public SignInPage signIn() {
        waitUntilPresenceOfElementLocated(LOG_IN).click();
        return new SignInPage();
    }
}
