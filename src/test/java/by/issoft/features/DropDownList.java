package by.issoft.features;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;

public class DropDownList {
    SelenideElement dropDownListOpenButton = $(By.xpath("//select[@id='dropdown']"));
    ElementsCollection dropDownOptions = $$(By.xpath("//select[@id='dropdown']//option"));
    String dropDownOptionSelected = "//select[@id='dropdown']//option[contains(@selected, 'selected')]";

    /**
     * open dropdown get all options and click on random option
     *
     * @return selected option index
     */
    public int clickOnRandomSelect() {
        open("https://the-internet.herokuapp.com/dropdown");
        dropDownListOpenButton.waitUntil(Condition.visible, 1000l);
        dropDownListOpenButton.click();
        List<SelenideElement> selectOptions = new ArrayList<>(dropDownOptions);

        //check collection != null and collection.size() != 0
        assert CollectionUtils.isNotEmpty(selectOptions);

        //random value generation
        Random random = new Random();
        int randomIndex = random.nextInt(selectOptions.size());
        dropDownListOpenButton.selectOption(randomIndex);
        return randomIndex;
    }

    public int getSelectedOptionValue() {
        SelenideElement dropDownOption = $(By.xpath(dropDownOptionSelected));
        return Integer.parseInt(Objects.requireNonNull(dropDownOption.getValue()));
    }
}
