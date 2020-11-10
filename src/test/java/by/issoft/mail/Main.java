package by.issoft.mail;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main {
    LoginPage loginPage = new LoginPage();
    EmailPage emailPage = new EmailPage();


   @Test(dataProvider = "dataForLetterInput", dataProviderClass = DataManagerMail.class)
   public void letterGeneration(String letterReceiverValue, String letterTitleValue, String letterBodyValue) {


        loginPage.login("*****", "*****");

        //create and sent leter
        emailPage.letterCreation();
        emailPage.letterReceiverField.setValue(letterReceiverValue);
        emailPage.letterTitleField.setValue(letterTitleValue);
        emailPage.letterBodyField.setValue(letterBodyValue);
        emailPage.sentLetter();

        //check new letter
       emailPage.goToInbox();

       SoftAssert softAssert = new SoftAssert();

       String letterTitleValue1 = emailPage.letterTitleNumberOne.getText();
       String letterTitleValue2 = emailPage.letterTitleNumberTwo.getText();
       String letterTitleValue3 = emailPage.letterTitleNumberThree.getText();
       ;
       Configuration.timeout = 6000;


       softAssert.assertEquals(letterTitleValue1,letterTitleValue, "It is not our letter");

       softAssert.assertEquals(letterTitleValue2,letterTitleValue, "It is not our letter");

       softAssert.assertEquals(letterTitleValue3,letterTitleValue, "It is not our letter");
       softAssert.assertAll("chack your emals");


    }
}
