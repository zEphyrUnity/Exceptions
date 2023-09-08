package homeworks.attestation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class writeUserData {
    public void writeData(String userData) throws IOException {
        String fileName = userData;
        fileName = fileName.substring(fileName.indexOf("<") + 1);
        fileName = fileName.substring(0, fileName.indexOf(">"));

        try(FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedReader reader  = new BufferedReader(new FileReader(fileName))){

            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

            boolean contains = sb.toString().contains(fileName);
            if(contains)
                fileWriter.write("\n");

            fileWriter.write(userData);
        }
    }
}
