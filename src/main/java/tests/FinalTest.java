package tests;

import core.constants.FileConstants;
import org.junit.Test;
import pages.MainPage;

import static core.utils.StringUtils.getUniqueString;
import static org.junit.Assert.assertTrue;
import static pages.CheckTicket.realNameOfPicture;
import static pages.CheckTicket.realTitle;

public class FinalTest extends BaseTest {

    private static final String TEST_SUMMARY = getUniqueString();
    private static final String TEST_PICTURE = FileConstants.IMAGE_JPEG.getPath();
    protected static final String BODY_INPUT = "-";

    @Test
    public void examTest() {

        new MainPage()
                .signIn()
                .enterToSystem()
                .newTicket()
                .addFieldOfSummary(TEST_SUMMARY)
                .addPicture(TEST_PICTURE)
                .addAllFields(BODY_INPUT)
                .submit();

        String realNameOfPicture = realNameOfPicture();
        String realTitle = realTitle();

        assertTrue("В заголовке присутсвует имя тикета, заполненное в поле SUMMARY",
                realTitle.contains(TEST_SUMMARY));
        assertTrue("Имена файлов совпадают", TEST_PICTURE.contains(realNameOfPicture));
    }
}
