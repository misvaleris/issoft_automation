package by.issoft.evroopt;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EvrooptTest {

    @Test
    public void checkCoffee() {
        String coffeePriceExpected = "55р.20к.";
        //open site
        open("https://e-dostavka.by");
        //click on search button
        $(By.xpath("//div[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        //insert in search
        $(By.xpath("//input[@id='searchtext']")).setValue("Кофе молотый «Dallmayr» classic, 250 г.");
        //click on search button
        $(By.xpath("//div[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        //get item price
        String coffeePriceActual =  $(By.xpath("//div[@class='price']")).getText();
        System.out.println(coffeePriceActual);
        Assert.assertEquals(coffeePriceActual, coffeePriceExpected, "Coffee price is different!");
    }
}
