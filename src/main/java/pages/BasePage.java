package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;

public class BasePage {
    public BasePage(By rootElement) {
        waitUntilPresenceOfElementLocated(rootElement);
    }
}
