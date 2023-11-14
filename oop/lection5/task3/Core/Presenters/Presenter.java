package oop.lection5.task3.Core.Presenters;

 
import oop.lection5.task3.Core.Infrastructure.Generator;
import oop.lection5.task3.Core.Models.Model;
import oop.lection5.task3.Core.Views.View;
import oop.lection5.task3.Mathematics.Exceptions.UnacceptableValueException;
import oop.lection5.task3.Mathematics.Shapes.Circle;
import oop.lection5.task3.Mathematics.Shapes.Rectangle;
import oop.lection5.task3.Mathematics.Shapes.Shape;

public class Presenter {
    Model model;
    View view;

    public Presenter(View view, Model model) {
        this.model = model;
        this.view = view;
    }

    public void append() throws UnacceptableValueException {
        view.set("1 - Circle, 2 - Rectangle");
        String response = view.get();
        Shape figure;

        switch (response) {
            case "1":
                figure = Circle.create(Generator.number(), "Circle_" + Generator.number());
                break;
            default:
                figure = Rectangle.create(
                    Generator.number(),
                    Generator.number(),
                    "Rectangle_" + Generator.number());
                break;
        }

        model.append(figure);
        view.set("ok");

    }

    public void show() {
        view.set(model.show());
    }

    public void showArea()
        {
            view.set(String.format("all Area %s", model.area()));
        }
}
