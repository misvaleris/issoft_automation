package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertEquals;

public class Main {

    @Test(dataProvider = "dataForLetterInput", dataProviderClass = DataManagerMail.class)
    public void createLetter(String letterReceiver, String letterTitle, String letterBody) {
        open("https://mail.ru");
        String login = "//input[@id='mailbox:login-input']";
        SelenideElement enterPass = $(By.xpath("//input[@class='o-control']"));
        String password = "//input[@id='mailbox:password-input']";
        SelenideElement submit = $(By.xpath("//input[@class='o-control']"));

        $(By.xpath(login)).setValue("xxxxxxxx");
        enterPass.click();
        $(By.xpath(password)).setValue("xxxxxxx");
        submit.click();

        // Open LetterCreation pop-up

        SelenideElement createLetter = $(By.xpath("//span[@class='compose-button__txt']"));
        createLetter.click();

        // Set value form DataManagerMail

        $(By.xpath("//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@class='container--H9L5q size_s--3_M-_']")).setValue(letterReceiver);
        $(By.xpath("//input[@name='Subject']")).setValue(letterTitle);
        $(By.xpath("//div[contains(normalize-space(@class), 'cke_editable cke_editable_inline cke_contents_true cke_show_borders')]/div")).setValue(letterBody);

        // Sent Letter

        SelenideElement sentLetter = $(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']//span[@class='button2__txt']"));
        sentLetter.click();

        //find sent letter theme in DOM by letter theme span class and theme value

        String actualLetterTitle = $(By.xpath("//span[contains(normalize-space(@class), 'llc__subject llc__subject_unread')]//span[contains(normalize-space(@class), 'll-sj__normal')]"))
                .getText();
        assertEquals(actualLetterTitle, letterTitle, "Theme title is not equals");
    }
}
