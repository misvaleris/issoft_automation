package by.issoft.features;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class KeyPress {
    SelenideElement inputField = $(By.xpath("//input[@id='target']"));
    SelenideElement resultValue = $(By.xpath("//p[@id='result']"));

    public void inputKeyPress() {
        open("https://the-internet.herokuapp.com/key_presses");
        inputField.click();
        inputField.pressEnter();
        String enterValue = resultValue.getOwnText();
        inputField.pressEscape();
        String escapeValue = resultValue.getOwnText();
        inputField.pressTab();
        String tabValue = resultValue.getOwnText();
        inputField.setValue("a");
        String textValue = resultValue.getOwnText();
    }
}
