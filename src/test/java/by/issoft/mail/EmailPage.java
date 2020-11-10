package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EmailPage {
    SelenideElement createLetterButton = $(By.xpath("//span[@class='compose-button__txt']"));
    //I need help with this xPath ->
    SelenideElement letterReceiverField = $(By.xpath("//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@class='container--H9L5q size_s--3_M-_']"));
    SelenideElement letterTitleField = $(By.xpath("//input[@name='Subject']"));
    SelenideElement letterBodyField = $(By.xpath("//div[contains(@class, 'cke_editable')]/div"));
    //I need help with this xPath ->
    SelenideElement sentLetterButton = $(By.xpath("//span[@class='button2 button2_base button2_primary button2_hover-support js-shortcut']//span[@class='button2__txt']"));
    SelenideElement inboxLettersButton = $(By.xpath("//a[@href='/inbox/']//div[@class='nav__folder-name__txt']"));
    SelenideElement letterTitleNumberOne = $(By.xpath("//div[@class='dataset__items']/a[1]//span[@class='ll-sj__normal']"));
    SelenideElement letterTitleNumberTwo = $(By.xpath("//div[@class='dataset__items']/a[2]//span[@class='ll-sj__normal']"));
    SelenideElement letterTitleNumberThree = $(By.xpath("//div[@class='dataset__items']/a[3]//span[@class='ll-sj__normal']"));



    public void letterCreation() {
        createLetterButton.click();
    }

    public void sentLetter() {
        sentLetterButton.click();

    }

    public void goToInbox(){
        inboxLettersButton.doubleClick();
    }


}