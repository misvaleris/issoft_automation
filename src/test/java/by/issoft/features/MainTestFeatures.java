package by.issoft.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.FileNotFoundException;

import static org.testng.Assert.assertEquals;

public class MainTestFeatures {
    DropDownList dropDownList = new DropDownList();
    IFrame iFrame = new IFrame();
    Download download = new Download();
    KeyPress keyPress = new KeyPress();

      @Test
    public void dropDownTest() {
        int expectedSelectedOptionValue = dropDownList.clickOnRandomSelect();
        int actualSelectedOptionValue = dropDownList.getSelectedOptionValue();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSelectedOptionValue, expectedSelectedOptionValue, "Fail with select dropdown  option");
    }

      @Test
    public void iFrameTest() {
        String expectedText = "Avada Kedavra";
        iFrame.createNewText(expectedText);
        String actualText = iFrame.getTextFromRichEditor();
        assertEquals(actualText, expectedText, "Fail create text in rich editor");
    }

      @Test
    public void downloadTest() throws FileNotFoundException {
        Download.DownloadFileInfo downloadFileInfo = download.downloadFiles();
        String actualFileName = downloadFileInfo.getFile().getName();
        String expectedFileName = downloadFileInfo.getSelectedFileName();
        assertEquals(actualFileName, expectedFileName, "Filename not equals");
    }

    @Test
    public void keyPressTest() {
        keyPress.inputKeyPress();
        //TODO add assert to review expected and actual values
    }

}
