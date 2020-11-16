package by.issoft.features;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.By;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;


public class Download {
    ElementsCollection downloadValues = $$(By.xpath("//div[@class='example']//a"));

    public DownloadFileInfo downloadFiles() throws FileNotFoundException {
        open("https://the-internet.herokuapp.com/download");
        List<SelenideElement> selectOptions = new ArrayList<>(downloadValues);
        //check collection != null and collection.size() != 0
        assert CollectionUtils.isNotEmpty(selectOptions);

        //random value generation
        Random random = new Random();
        int randomIndex = random.nextInt(selectOptions.size());
        SelenideElement randomElement = selectOptions.get(randomIndex);
        String fileName = randomElement.getText();
        File file = randomElement.download();
        return new DownloadFileInfo(file, fileName);
    }
    //TODO check file which was downloaded

    @AllArgsConstructor
    @Getter
    public static class DownloadFileInfo{
        private final File file;
        private final String selectedFileName;
    }
}
