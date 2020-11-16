package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class EmailPage {
    private static final String LETTER_TITLE_X_PATH_TEMPLATE = "//div[@class='dataset__items']/a[%s]//span[@class='ll-sj__normal']";
    SelenideElement createLetterButton = $(By.xpath("//span[@class='compose-button__txt']"));
    SelenideElement letterReceiverField = $(By.xpath("//div[contains(@class, 'contactsContainer')]//input"));
    SelenideElement letterTitleField = $(By.xpath("//input[@name='Subject']"));
    SelenideElement letterBodyField = $(By.xpath("//div[contains(@class, 'cke_editable')]/div"));
    //I need help with this xPath ->
    SelenideElement sentLetterButton = $(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']//span[@class='button2__txt']"));
    SelenideElement inboxLettersButton = $(By.xpath("//a[@href='/inbox/']//div[@class='nav__folder-name__txt']"));
    SelenideElement sendMessagePopupCloseButton = $(".ico_16-close");

    public void createLetter() {
        createLetterButton.click();
    }

    public void fillLetter(String letterReceiverValue, String letterTitleValue, String letterBodyValue) {
        letterReceiverField.setValue(letterReceiverValue);
        letterTitleField.setValue(letterTitleValue);
        letterBodyField.setValue(letterBodyValue);
    }

    public void sentLetter() {
        sentLetterButton.click();
        sendMessagePopupCloseButton.click();
    }

    public void goToInbox() {
        inboxLettersButton.click();
    }

    public List<SelenideElement> getNCountLetterTitles(int letterTitlesCount) {
        List<SelenideElement> result = new ArrayList<>();
        for (int i = 1; i <= letterTitlesCount; i++) {
            String letterTitleXPath = String.format(LETTER_TITLE_X_PATH_TEMPLATE, i);
            result.add($(By.xpath(letterTitleXPath)));
        }
        return result;
    }
}
