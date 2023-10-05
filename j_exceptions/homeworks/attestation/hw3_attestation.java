package j_exceptions.homeworks.attestation;

import java.io.*;

public class hw3_attestation {
    public static void main(String[] args) {
        try {
            writeUserData writeClass = new writeUserData();
            parseUserData parseClass = new parseUserData();
            takeUserData takeClass = new takeUserData();

            writeClass.writeData(parseClass.parseData((takeClass.takeData())));
        }catch (IOException e){
            System.out.println("Catch EXCEPTION - " + e.getClass().getSimpleName() + " " + e);
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Catch EXCEPTION - " + e.getClass().getSimpleName() + " " + e);
        }
    }
}