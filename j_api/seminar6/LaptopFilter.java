package j_api.seminar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class LaptopFilter {
    public Map<Laptop, String> laptopFinder(Set<Laptop> store) {
        boolean exit = true;
        Map<Laptop, String> chooseResult = new HashMap<>();
        Scanner in = new Scanner(System.in);

        while (exit) {
            String userChoose = "";

            System.out.println("Выберите критерий для поиска:");
            System.out.println("Введите 1: по объему памяти");
            System.out.println("Введите 2: по объему жесткого диска");
            System.out.println("Введите 3: по типу операционной системы");
            System.out.println("Введите 4: по цвету");
            System.out.println("Введите 0: для выхода");
            userChoose = in.nextLine();

            switch (userChoose) {
                case ("1"):
                    System.out.print("Введите объем памяти: ");
                    userChoose = in.nextLine();
                    for(var item: store){
                        if(item.getMain_Memory() == Integer.parseInt(userChoose)){
                            chooseResult.put(item, item.getMain_Memory() + "");
                        }
                    }
                    exit = false;
                    break;
                case ("2"):
                    System.out.print("Введите объем жесткого диска: ");
                    userChoose = in.nextLine();
                    for(var item: store){
                        if(item.getHdd_capacity() == Integer.parseInt(userChoose)){
                            chooseResult.put(item, item.getHdd_capacity() + "");
                        }
                    }
                    exit = false;
                    break;
                case ("3"):
                    System.out.print("Введите тип операционной системы: ");
                    userChoose = in.nextLine();
                    for(var item: store){
                        if(item.getOS().equals(userChoose)){
                            chooseResult.put(item, item.getOS());
                        }
                    }
                    exit = false;
                    break;
                case ("4"):
                    System.out.print("Введите цвет ноутбука: ");
                    userChoose = in.nextLine();
                    for(var item: store){
                        if(item.getColour().equals(userChoose)){
                            chooseResult.put(item, item.getColour());
                        }
                    }
                    exit = false;
                    break;
                case ("0"):
                    exit = false;
                    break;
            }
        }

        return chooseResult;
    }
}
