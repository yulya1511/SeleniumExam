package tests;

import core.utils.WaitUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.driver.DriverManager.closeDriver;
import static core.utils.DriverUtils.open;
import static core.utils.DriverUtils.openWindowMax;
import static core.utils.ResourcesUtils.getResource;

abstract public class BaseTest {

    protected WebDriverWait wait;
    protected final static String HOST = "URL_HOST";

    @Before
    public void setUp() {
        open(getResource(HOST));
        openWindowMax();
        wait = WaitUtils.getExplicitWait();
    }

    @After
    public void tearDown() {
        closeDriver();
    }
}
