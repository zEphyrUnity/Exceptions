package oop.toy_shop.Service;

import oop.toy_shop.Model.Draw;
import oop.toy_shop.Model.iLotteryBasket;

public interface iFileWriter {
    void prizeWriter(iLotteryBasket basket, String filePath, Draw prize);
}
