package homeworks.attestation;

import java.io.IOException;
import java.util.Scanner;

public class takeUserData {
    public String[] takeData() throws IOException {
        final int wordsNum = 6;
        String userData = "";
        String[] splitUserData;

        try (Scanner in = new Scanner(System.in)) {
            userData = in.nextLine().trim();
            splitUserData = userData.split(" ");

            if (userData.isEmpty())
                throw new RuntimeException("--> Вы не ввели данные");

            if (splitUserData.length < wordsNum) {
                throw new RuntimeException("--> Вы ввели меньше данных чем необходимо");
            }

            if (splitUserData.length > wordsNum) {
                throw new RuntimeException("--> Вы ввели больше данных чем необходимо");
            }
        }

        return splitUserData;
    }
}
