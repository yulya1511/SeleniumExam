package pages;

import org.openqa.selenium.By;

import static core.utils.WaitUtils.waitUntilPresenceOfElementLocated;

public class CheckTicket extends BasePage {

    public CheckTicket() {
        super(By.xpath("//ol[@class='breadcrumb']"));
    }


    public static String realTitle() {
         return waitUntilPresenceOfElementLocated(By.xpath("//div[@class='card-body']//h3"))
                 .getText();
    }

    public static String realNameOfPicture() {
        return waitUntilPresenceOfElementLocated(
                By.xpath("//div[@class='attachments']//a[text()='Norway.jpg']")).getText();
    }
}
