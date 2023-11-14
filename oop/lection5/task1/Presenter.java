package oop.lection5.task1;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void userAction(){
        model.setX(view.getValue("a: "));
        model.setY(view.getValue("b: "));

        view.print("Sum: ", model.result());
    }
}
