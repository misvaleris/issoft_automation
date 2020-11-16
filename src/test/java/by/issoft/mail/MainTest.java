package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class MainTest {
    LoginPage loginPage = new LoginPage();
    EmailPage emailPage = new EmailPage();

    @Test(dataProvider = "dataForLetterInput", dataProviderClass = DataManagerMail.class)
    public void letterGeneration(EmailData emailData) {
        loginPage.login(emailData.getEmail(), emailData.getPassword());
        List<LettersData> lettersData = emailData.getLettersData();
        for (LettersData letterData : lettersData) {
            emailPage.createLetter();
            emailPage.fillLetter(
                    letterData.getLetterReceiverValue(),
                    letterData.getLetterTitleValue(),
                    letterData.getLetterBodyValue()
            );
            emailPage.sentLetter();
        }
        //TODO maybe press f5
        emailPage.goToInbox();

        List<SelenideElement> nCountLetterTitles = emailPage.getNCountLetterTitles(lettersData.size());
        SoftAssert softAssert = new SoftAssert();
        for (LettersData letterData : lettersData) {
            for (SelenideElement nCountLetterTitle : nCountLetterTitles) {
                String actualLetterTitleValue = nCountLetterTitle.getValue();
                String expectedLetterTitleValue = letterData.getLetterTitleValue();
                softAssert.assertEquals(actualLetterTitleValue, expectedLetterTitleValue, "It is not our letter");
            }
        }
        softAssert.assertAll("check your emals");
        loginPage.logOutCurrentUser();
    }
}
