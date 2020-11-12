package by.issoft.mail;

import lombok.Data;

import java.util.List;
@Data
public class EmailData {
    String email;
    String password;
    List<LettersData> lettersData;

}
