package by.issoft.mail;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.nio.file.Paths;


public class DataManagerMail {

    @DataProvider
    public Object[] dataForLetterInput() throws IOException {
        return readFromJson();
    }

    private EmailData[] readFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String filePath = "src/test/resources/EmailTemplates.json";
        return mapper.readValue(Paths.get(filePath).toFile(), EmailData[].class);
    }

}
