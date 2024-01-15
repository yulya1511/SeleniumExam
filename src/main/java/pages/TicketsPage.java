package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;

public class TicketsPage extends BasePage {

    private static final By NEW_TICKET = By.xpath("//*[text()='New Ticket']");

    public TicketsPage() {
        super(By.xpath("//li[contains(@class, 'nav') and contains(text(), 'Query')]"));
    }

    public CreateTicket newTicket(){
        waitUntilPresenceOfElementLocated(NEW_TICKET).click();
        return new CreateTicket();
    }
}
