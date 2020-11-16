package by.issoft.features;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class IFrame {
    private static final String RICH_EDITOR_IFRAME_ID = "mce_0_ifr";
    private static final String RICH_EDITOR_TEXT_BODY_XPATH = "//body[@id='tinymce']//p";
    SelenideElement fileButton = $(By.xpath("//span[.='File']"));
    SelenideElement newDocumentButton = $(By.xpath("//span[.='New document']"));
//    SelenideElement boldButton = $(By.xpath("//div//button//i[@class='mce-ico mce-i-bold']"));
//    SelenideElement alignToCenterButton = $(By.xpath("//i[@class='mce-ico mce-i-aligncenter']"));
//    SelenideElement undoButton = $(By.xpath("//span[.='Undo']"));

    public void createNewText(String text) {
        open("https://the-internet.herokuapp.com/iframe");
        fileButton.click();
        newDocumentButton.click();
        setTextToRichEditor(text);
    }
    //TODO ad faker and text

    private void setTextToRichEditor(String text) {
        Selenide.switchTo().frame(RICH_EDITOR_IFRAME_ID);
        SelenideElement textBody = $(By.xpath(RICH_EDITOR_TEXT_BODY_XPATH));
        textBody.setValue(text);
        Selenide.switchTo().defaultContent();
    }

    public String getTextFromRichEditor() {
        Selenide.switchTo().frame(RICH_EDITOR_IFRAME_ID);
        SelenideElement textBody = $(By.xpath(RICH_EDITOR_TEXT_BODY_XPATH));
        String result = textBody.getText();
        Selenide.switchTo().defaultContent();
        return result;
    }
}
