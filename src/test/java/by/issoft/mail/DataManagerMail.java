package by.issoft.mail;

import org.testng.annotations.DataProvider;

public class DataManagerMail {

    @DataProvider
    public Object[][] dataForLetterInput() {
        Object[][] data = new Object[1][3];

        data[0][0] = "valerevna944@mail.ru";
        data[0][1] = "My first email Test";
        data[0][2] = "Hello, I am Valeria and I am writing to myself";
        return data;
    }
}
