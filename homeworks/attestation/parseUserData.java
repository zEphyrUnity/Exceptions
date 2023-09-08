package homeworks.attestation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class parseUserData {
    public String parseData(String[] userString) throws RuntimeException{
        String parseResult = "";
        String regex = "^[а-яА-ЯA-za-z]{2,25}";
        boolean isSurname = userString[0].matches(regex);

        if(!isSurname){
            throw new RuntimeException("--> Неверно введена фамилия!");
        }else {
            parseResult += "<" + userString[0] + ">";
        }

        try {
            boolean isValid = userString[1].matches(regex);
            if(!isValid){
                throw new RuntimeException("--> Неверно введено имя!");
            }else {
                parseResult += "<" + userString[1] + ">";
            }

            isValid = userString[2].matches(regex);
            if(!isValid){
                throw new RuntimeException("--> Неверно введено отчество!");
            }else {
                parseResult += "<" + userString[2] + ">";
            }

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date birthday = dateFormat.parse(userString[3]);
            parseResult += "<" + userString[3] + ">";

            String[] dateSplit = userString[3].split("\\.");
            int day = Integer.parseInt(dateSplit[0]);
            int month = Integer.parseInt(dateSplit[1]);
            int year = Integer.parseInt(dateSplit[2]);

            if(day < 1 || day > 31 || month < 1 || month > 12 || year < 1900 || year > 2023){
                throw new RuntimeException("--> День рождения введён не верно!");
            }

            isValid = userString[4].matches("^[1-9][0-9]{9,11}");
            if (!isValid) {
                throw new RuntimeException("--> Не верный формат номера телефона!");
            }else{
                parseResult += "<" + userString[4] + ">";
            }

            isValid = userString[5].matches("[fFmM]");
            if (!isValid) {
                throw new RuntimeException("--> Неверно введен пол!");
            }else{
                parseResult += "<" + userString[5] + ">";
            }

        } catch (ParseException e) {
            throw new RuntimeException(e + " --> Не верный формат даты!");
        }

        return parseResult;
    }
}
