package by.issoft.features;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class KeyPress {
    SelenideElement inputField = $(By.xpath("//input[@id='target']"));
    SelenideElement resultValue = $(By.xpath("//p[@id='result']"));

    public String inputKeyPressEscape() {
        open("https://the-internet.herokuapp.com/key_presses");
        inputField.click();
        inputField.pressEscape();
        return resultValue.getOwnText();
    }

    public String inputKeyPressTab() {
        inputField.pressTab();
        return resultValue.getOwnText();
    }

    public String inputKeyPressLetter() {
        inputField.setValue("A");
        return resultValue.getOwnText();
    }
}
