package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;

public class CreateTicket extends BasePage {

    private static final By SUMMARY_FIELD = By.xpath("//input[@id='id_title']");
    private static final By CHOOSE_FILE = By.xpath("//input[@id='id_attachment']");
    private static final By QUEUE = By.xpath("//select[@name='queue']//option[text()='Some Product']");
    private static final By BODY = By.xpath("//textarea[@name='body']");
    private static final By CASE_OWNER = By.xpath("//select[@id='id_assigned_to']//option[text()='admin']");
    private static final By DATA_FIELD = By.xpath("//input[@id='id_due_date']");
    private static final By DATA = By.xpath("//a[text()='14']");
    private static final By SUBMIT_BUTTON = By.xpath("//button[@class='btn btn-primary btn-lg btn-block']");

    public CreateTicket() {
        super(By.xpath("//*[contains(text(), 'Unless otherwise')]"));
    }

    public CreateTicket addFieldOfSummary(String summary) {
        waitUntilPresenceOfElementLocated(SUMMARY_FIELD).clear();
        waitUntilPresenceOfElementLocated(SUMMARY_FIELD).sendKeys(summary);
        return new CreateTicket();

    }

    public CreateTicket addPicture(String path) {
        waitUntilPresenceOfElementLocated(CHOOSE_FILE).sendKeys(path);
        return new CreateTicket();
    }

    public CreateTicket addAllFields(String body) {
        waitUntilPresenceOfElementLocated(QUEUE).click();
        waitUntilPresenceOfElementLocated(BODY).sendKeys(body);
        waitUntilPresenceOfElementLocated(DATA_FIELD).click();
        waitUntilPresenceOfElementLocated(DATA).click();
        waitUntilPresenceOfElementLocated(CASE_OWNER).click();
        return new CreateTicket();
    }

    public CheckTicket submit() {
        waitUntilPresenceOfElementLocated(SUBMIT_BUTTON).click();
        return new CheckTicket();
    }
}
