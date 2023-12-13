package oop.toy_shop.Service;

import oop.toy_shop.Model.Draw;
import oop.toy_shop.Model.Toy;
import oop.toy_shop.Model.iLotteryBasket;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteService implements iFileWriter {
    @Override
    public void prizeWriter(iLotteryBasket basket, String filePath, Draw draw){
        Toy prize = draw.prizeDraw(basket.getLotteryBasket());

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            if(basket.getLotteryBasket() == null)
                throw new NullPointerException();

            bufferedWriter.write(prize.getName() + " " + prize.getId() + " " + prize.getWeight());
            bufferedWriter.newLine();
        } catch (IOException | NullPointerException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
