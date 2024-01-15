package tests;

import org.junit.Test;
import pages.MainPage;

import static core.utils.ResourcesUtils.getResource;


public class FinalTests extends BaseTest {

    private static String expectedTitle = getResource("SUMMARY");
    private static String expectedNameOfPicture = "Norway.jpg";


    @Test
    public void examTest() {

        new MainPage()
                .signIn()
                .enterToSystem()
                .newTicket()
                .addFieldOfSummary()
                .addPicture()
                .submit();

//        String realNameOfPicture = realNameOfPicture();
//        String realTitle = realTitle();
//        assertTrue(
//        "В заголовке присутсвует имя тикета, заполненное в поле SUMMARY",realTitle.contains(expectedTitle));

//        assertEquals("Имена файлов совпадают", realNameOfPicture, expectedNameOfPicture);
    }
}
