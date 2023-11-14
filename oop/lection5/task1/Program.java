package oop.lection5.task1;

public class Program {
    public static void main(String[] args){
        Presenter p = new Presenter(new SumModel(), new View());
        p.userAction();
        p.userAction();
        p.userAction();
    }
}
