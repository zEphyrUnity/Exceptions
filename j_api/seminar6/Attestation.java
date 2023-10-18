package j_api.seminar6;

// 1. Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков Set<Laptop>. (добиться чтобы во множестве не было одинаковых ноутбуков)
// 3. (*) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру,
// соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Attestation {
    public static void main(String[] args){
        LaptopFilter laptopFilter = new LaptopFilter();

        Laptop asus = new Laptop("Asus", "Ubuntu", "magenta", 123123,
                500, 128,  1024);
        Laptop asusNewModel = new Laptop("Asus", "Windows", "blue", 123345,
                400, 64,  512);
        Laptop dell = new Laptop("Dell", "Windows", "blue", 432432,
                400, 64,  2048);
        Laptop dellNewModel = new Laptop("Dell", "Windows", "blue", 432123,
                400, 128,  4096);
        Laptop Huawei = new Laptop("Huawei", "Linux", "black", 23467,
                500, 128,  1024);
        Laptop AlienWare = new Laptop("AlienWare", "OS/2", "black", 457467,
                500, 256,  5128);
        Laptop Lenovo = new Laptop("Lenovo", "Windows", "black", 987566,
                500, 64,  1024);


        Set<Laptop> laptops = new HashSet<Laptop>();
        laptops.add(asus);
        laptops.add(asusNewModel);
        laptops.add(dell);
        laptops.add(dellNewModel);
        laptops.add(Huawei);
        laptops.add(AlienWare);
        laptops.add(Lenovo);

        var result = laptopFilter.laptopFinder(laptops);
        System.out.println(result.size());

        for(Map.Entry<Laptop, String> item: result.entrySet()){
            System.out.println(item.getKey().getName() + " / " + item.getKey().getMain_Memory() + " / "
                    + item.getKey().getHdd_capacity()  + " / " + item.getKey().getOS() + " / "
                    + item.getKey().getColour());
        }
    }
}


