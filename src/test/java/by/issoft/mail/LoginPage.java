package by.issoft.mail;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    String loginField = "//input[@id='mailbox:login-input']";
    SelenideElement submitLoginButton = $(By.xpath("//input[@class='o-control']"));
    String passwordField = "//input[@id='mailbox:password-input']";
    SelenideElement submitPasswordButton = $(By.xpath("//input[@class='o-control']"));
    SelenideElement logOutButton = $(By.xpath("//a[@id='PH_logoutLink']"));

    public void login(String email, String password) {
        open("https://mail.ru");
        $(By.xpath(loginField)).setValue(email);
        submitLoginButton.click();
        $(By.xpath(passwordField)).setValue(password);
        submitPasswordButton.click();
    }
    public void logOut(){
        logOutButton.click();
    }
}
