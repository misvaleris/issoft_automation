package by.issoft.mail;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainTest {
    LoginPage loginPage = new LoginPage();
    EmailPage emailPage = new EmailPage();


    @Test(dataProvider = "dataForLetterInput", dataProviderClass = DataManagerMail.class)
    public void letterGeneration(EmailData emailData) {
        loginPage.login(emailData.getEmail(), emailData.getPassword());
        for (LettersData letterData : emailData.getLettersData()) {
            sentLetterAndCheckResult(
                    letterData.getLetterReceiverValue(),
                    letterData.getLetterTitleValue(),
                    letterData.getLetterBodyValue()
            );
            loginPage.logOut();
        }


    }

    private void sentLetterAndCheckResult(String letterReceiverValue, String letterTitleValue, String letterBodyValue) {
        //create and sent letter
        emailPage.createAndSentLetter(letterReceiverValue, letterTitleValue, letterBodyValue);

        //check new letter
        emailPage.goToInbox();

        //TODO need to wait

        String letterTitleValue1 = emailPage.letterTitleNumberOne.getText();
        String letterTitleValue2 = emailPage.letterTitleNumberTwo.getText();
        String letterTitleValue3 = emailPage.letterTitleNumberThree.getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(letterTitleValue1, letterTitleValue, "It is not our letter");
        softAssert.assertEquals(letterTitleValue2, letterTitleValue, "It is not our letter");
        softAssert.assertEquals(letterTitleValue3, letterTitleValue, "It is not our letter");
        softAssert.assertAll("chack your emals");
    }
}
