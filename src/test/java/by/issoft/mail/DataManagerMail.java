package by.issoft.mail;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataManagerMail {

    @DataProvider
    public Iterator<Object[]> dataForLetterInput() throws IOException {
       // Object[][] data = new Object[3][3];

        return parseCsvData("src/test/resources/EmailTemplates.csv");

//        data[0][0] = "valerevna944@mail.ru";
//        data[0][1] = "My first email Test";
//        data[0][2] = "Hello, I am Valeria and I am writing to myself";
//        return data;
    }

    private Iterator<Object[]> parseCsvData(String fileName) throws IOException
    {
        BufferedReader input = null;
        File file = new File(fileName);
        input = new BufferedReader(new FileReader(file));
        String line = null;
        List<Object[]> data = new ArrayList<>();
        while ((line = input.readLine()) != null)
        {
            String in = line.trim();
            String[] temp = in.split(",");
            List<Object> arrray = new ArrayList<>();
            for(String s : temp)
            {
                arrray.add(Integer.parseInt(s));
            }
            data.add(arrray.toArray());
        }
        input.close();
        return data.iterator();
    }
}
